package java_tests.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

import java_tests.concurrent.ConcurrentUtils;

public class SynchronizedDemo
{
	int count = 0;
	ReentrantLock lock = new ReentrantLock();

	void increment()
	{
		count = count + 1;
	}

	synchronized void incrementSync()
	{
		count = count + 1;
	}

	void incrementWithLock()
	{
		lock.lock();
		try
		{
			count++;
		}
		finally
		{
			lock.unlock();
		}
	}

	public static void main(String[] args)
	{
		SynchronizedDemo demo = new SynchronizedDemo();

		ExecutorService executor = Executors.newFixedThreadPool(2);

		// IntStream.range(0, 10000).forEach(i -> executor.submit(demo::increment));
		//IntStream.range(0, 10000).forEach(i -> executor.submit(demo::incrementSync));
		IntStream.range(0, 10000).forEach(i -> executor.submit(demo::incrementWithLock));
		ConcurrentUtils.stop(executor);

		System.out.println(demo.count); // 9965

	}

}
