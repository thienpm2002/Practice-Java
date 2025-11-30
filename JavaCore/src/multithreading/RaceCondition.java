package multithreading;

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		// Thread 1 increments count 1000 times
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.increment();
		});

		// Thread 2 increments count 1000 times
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.increment();
		});

		// Start thread 1
		t1.start();

		// Start thread 2
		t2.start();

		// Wait for thread 1 to finish
		t1.join();

		// Wait for thread 2 to finish
		t2.join();

		// May be < 2000 due to race condition
		System.out.println("Final Count: " + c.count);
	}
}
