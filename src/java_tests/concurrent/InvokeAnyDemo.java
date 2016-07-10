package java_tests.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class InvokeAnyDemo
{
	static Callable<String> callable(String result, long sleepSeconds) {
	    return () -> {
	        TimeUnit.SECONDS.sleep(sleepSeconds);
	        return result;
	    };
	}
	
	public static void main(String[] args)
	{
		
		ExecutorService executor = Executors.newWorkStealingPool();

		List<Callable<String>> callables = Arrays.asList(
		    callable("task1", 2),
		    callable("task2", 1),
		    callable("task3", 3));
		
		String result = null;
		
		try
		{	
			result = executor.invokeAny(callables);
		}
		catch (Exception e)
		{
			System.out.println("ERROR"); 
		}
		System.out.println(result);			
	}

}
