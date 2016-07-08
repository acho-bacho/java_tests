package java_tests.threads;

public class ThreadsTwo
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				int count = 0;
				while (true)
				{
					System.out.println(name + ": " + count++);
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException ie)
					{
					}
				}
			}
		};
		Thread thdA = new Thread(r);
		thdA.setName("A");
		thdA.start();
		
		Thread thdB = new Thread(r);
		thdB.setName("B");
		thdB.start();
		
		Thread thdC = new Thread(r);
		thdC.setName("C");
		thdC.start();
		
		Thread thdD = new Thread(r);
		thdD.setName("D");
		thdD.start();
	}
}