package blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

		Producer p = new Producer(queue);
		Consume c = new Consume(queue);

		Thread producer = new Thread(p);
		Thread consume = new Thread(c);

		producer.start();
		consume.start();
	}
}
