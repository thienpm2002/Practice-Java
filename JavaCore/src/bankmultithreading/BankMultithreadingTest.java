package bankmultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankMultithreadingTest {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Bank bank = new Bank(100);
		for (int i = 1; i < 20; i++) {
			int money = i;
			executor.submit(() -> {
				if (bank.withdrawMoney(money)) {
					System.out.println(Thread.currentThread().getName() + " da rut thanh cong " + money);
				} else {
					System.out.println(Thread.currentThread().getName() + " da rut khong thanh cong " + money);
				}
			});
		}

		executor.shutdown();
		if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
			executor.shutdownNow();
		}

		System.out.println("Final balance = " + bank.getBalance());
	}
}
