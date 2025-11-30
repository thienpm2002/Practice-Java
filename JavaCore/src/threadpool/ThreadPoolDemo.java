package threadpool;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		SimpleThreadPool pool = new SimpleThreadPool(10);

		for (int i = 1; i <= 15; i++) {
			int taskId = i;
			pool.submit(() -> {
				System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					Thread.currentThread().interrupt();
				}
			});
		}

		pool.shutdow();
	}
}
