package java_tests.threads;

public class RunnableTest
{
	public static void main(String[] args)
	{
		//lambda
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};

		
		//with lambda inline 
		Thread thread = new Thread(() -> System.out.println("Hello " + Thread.currentThread().getName()) );
		thread.start();
		
		Thread thread2 = new Thread(task);
		thread2.start();

		System.out.println("Done!");
	}
}
