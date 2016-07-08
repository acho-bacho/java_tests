package java_tests.threads;


public class WaitNotifyExample
{
	public static void main(String[] args)
	{
		Shared s = new Shared();
		Producer prod = new Producer(s);
		prod.setName("procuder__");
		prod.start();
		
		
		Consumer cons = new Consumer(s);
		cons.setName("consumer__");
		cons.start();
	}
}

class Shared
{
	private char c = '\u0000';
	private boolean canWrite = true;

	synchronized void setSharedChar(char c)
	{
		while (!canWrite)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
			}
		}
		this.c = c;
		canWrite = false;
		notify();
	}

	synchronized char getSharedChar()
	{
		while (canWrite)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
			}			
		}
		canWrite = true;
		notify();
		return c;
	}
}

class Producer extends Thread
{
	private Shared s;

	Producer(Shared s)
	{
		this.s = s;
	}

	@Override
	public void run()
	{
		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			synchronized (s)
			{
				s.setSharedChar(ch);
				System.out.println(ch + " produced by producer.");
			}
		}
	}
}

class Consumer extends Thread
{
	private Shared s;

	Consumer(Shared s)
	{
		this.s = s;
	}

	@Override
	public void run()
	{
		char ch;
		do
		{
			synchronized (s)
			{
				ch = s.getSharedChar();
				System.out.println(ch + " consumed by consumer.");
			}
		} while (ch != 'Z');
	}
}
