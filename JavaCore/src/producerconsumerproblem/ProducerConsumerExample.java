package producerconsumerproblem;

public class ProducerConsumerExample {
	public static void main(String[] args) {
		Buffer bf = new Buffer();

		Thread productor = new Thread(() -> {
			int value = 1;
			while (true) {
				try {
					bf.producer(value++);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

		Thread consume = new Thread(() -> {
			while (true) {
				try {
					bf.consume();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

		productor.start();
		consume.start();

	}
}
