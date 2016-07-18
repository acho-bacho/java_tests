package java_tests.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;


public class CallableDemo
{
	public static void main(String[] args)
	{
		for(int i=0;i<3; i--)
		{
			System.out.println(i);
		}
		Callable<Integer> task = () -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		        return 123;
		    }
		    catch (InterruptedException e) {
		        throw new IllegalStateException("task interrupted", e);
		    }
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);

		System.out.println("future done? " + future.isDone());
		
		Integer result = null;
		try
		{
			result = future.get(); //blocks the current thread and waits until the callable completes 
			//result = future.get(2, TimeUnit.SECONDS);
		}
		catch (Exception e2)
		{
			System.err.println("error");
		}

		System.out.println("future done? " + future.isDone());
		System.out.print("result: " + result);
	}
}


