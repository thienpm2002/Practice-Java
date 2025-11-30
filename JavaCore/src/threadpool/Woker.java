package threadpool;

import java.util.concurrent.BlockingQueue;

public class Woker extends Thread {
	private BlockingQueue<Runnable> taskQueue;
	private volatile boolean isRunning = true;

	public Woker(BlockingQueue<Runnable> queue, String name) {
		super(name);
		this.taskQueue = queue;
	}

	public void run() {
		while (isRunning) {
			try {
				Runnable task = taskQueue.take();
				if (task == SimpleThreadPool.POISON_PILL) {
					break;
				}
				task.run();
			} catch (InterruptedException e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}

		}
	}

	public void shutdow() {
		isRunning = false;
		this.interrupt();
	}
}
