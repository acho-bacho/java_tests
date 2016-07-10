package java_tests.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ScheduledExecutorDemo
{

	public static void main(String[] args)
	{
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime() + "\n");
		ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

		try
		{
			TimeUnit.MILLISECONDS.sleep(1337);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}

		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.printf("Remaining Delay: %sms\n", remainingDelay);

		int initialDelay = 0;
		int period = 1;
		//executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);

		Runnable task2 = () -> {
			try
			{
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Scheduling: " + System.nanoTime());
			}
			catch (InterruptedException e)
			{
				System.err.println("task interrupted");
			}
		};

		executor.scheduleWithFixedDelay(task2, 0, 1, TimeUnit.SECONDS);
	}

}
