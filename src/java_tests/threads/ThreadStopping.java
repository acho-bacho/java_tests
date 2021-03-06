package java_tests.threads;

public class ThreadStopping
{
	public static void main(String[] args)
	{
		class StoppableThread extends Thread
		{
			private boolean stopped = false;

			@Override
			public void run()
			{
				while (!isStopped())
					System.out.println("running");
			}

			synchronized void stopThread()
			{
				stopped = true;
			}

			private synchronized boolean isStopped()
			{
				return stopped;
			}
		}

		StoppableThread thd = new StoppableThread();
		thd.start();

		try
		{
			Thread.sleep(1000); // sleep for 1 second
		}
		catch (InterruptedException ie)
		{
		}
		thd.stopThread();
	}
}