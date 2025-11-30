package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consume implements Runnable {
	private BlockingQueue<Integer> queue;

	public Consume(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		while (true) {
			try {
				int value = queue.take();
				System.out.println("Consume by product: " + value);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
