package multithreading;

public class ThreadByRunnable {
	class Thread1 implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

	class Thread2 implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

	class Thread3 implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadByRunnable().new Thread1());
		Thread t2 = new Thread(new ThreadByRunnable().new Thread2());
		Thread t3 = new Thread(new ThreadByRunnable().new Thread3());

		t1.start();
		t2.start();
		t3.start();

	}
}
