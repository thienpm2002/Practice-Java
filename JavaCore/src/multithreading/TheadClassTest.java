package multithreading;

public class TheadClassTest {

	public static void main(String[] args) {
		Thread odd = new Thread(() -> {
			for (int i = 1; i < 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}
			}
		});

		Thread even = new Thread(() -> {
			for (int i = 0; i < 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}
			}
		});

		odd.start();
		even.start();

	}

}
