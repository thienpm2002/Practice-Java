package threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class SimpleThreadPool {
	private BlockingQueue<Runnable> taskQueue;
	private Woker[] workers;
	static final Runnable POISON_PILL = () -> {
	};

	public SimpleThreadPool(int size) {
		this.taskQueue = new LinkedBlockingDeque<>();
		this.workers = new Woker[size];

		for (int i = 0; i < size; i++) {
			workers[i] = new Woker(taskQueue, "Woker " + (i + 1));
			workers[i].start();
		}
	}

	public void submit(Runnable task) {
		taskQueue.offer(task);
	}

	public void shutdow() {
		for (int i = 0; i < workers.length; i++) {
			taskQueue.offer(POISON_PILL);
		}
	}
}
