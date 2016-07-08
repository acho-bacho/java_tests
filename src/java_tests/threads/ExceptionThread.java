package java_tests.threads;

public class ExceptionThread
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				int x = 1 / 0;
			}
		};
		
		Thread thd = new Thread(r);
		thd.setName("Testis-01");
		Thread.UncaughtExceptionHandler uceh;
		
		uceh = new Thread.UncaughtExceptionHandler()
		{
			@Override
			public void uncaughtException(Thread t, Throwable e)
			{
				System.out.println("Caught throwable " + e + " for thread " + t);
			}
		};
		
		thd.setUncaughtExceptionHandler(uceh);
		
		uceh = new Thread.UncaughtExceptionHandler()
		{
			@Override
			public void uncaughtException(Thread t, Throwable e)
			{
				System.out.println("Default uncaught exception handler");
				System.out.println("Caught throwable " + e + " for thread " + t);
			}
		};
		Thread.setDefaultUncaughtExceptionHandler(uceh);
		thd.start();
	}
}