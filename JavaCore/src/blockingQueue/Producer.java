package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		int value = 1;
		while (true) {
			try {
				queue.put(value);
				System.out.println("Producer add product" + value++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

}
