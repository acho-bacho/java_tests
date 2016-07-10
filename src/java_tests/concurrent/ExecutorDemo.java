package java_tests.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo
{
	public static void main(String[] args)
	{

//		Runnable r = () -> {
//			String threadName = Thread.currentThread().getName();
//			System.out.println("Hello runnable " + threadName);
//		};

		ExecutorService executor = Executors.newSingleThreadExecutor();
		//executor.submit(r);
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});

		try
		{
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (InterruptedException e)
		{
			System.err.println("tasks interrupted");
		}
		finally
		{
			if (!executor.isTerminated())
			{
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}
}