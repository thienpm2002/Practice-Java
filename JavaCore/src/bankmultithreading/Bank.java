package bankmultithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Bank {
	private int balance;
	private final ReentrantLock lock = new ReentrantLock();

	public Bank(int balance) {
		this.balance = balance;
	}

	public boolean withdrawMoney(int money) {
		lock.lock();
		try {
			if (money > balance) {
				return false;
			}
			balance -= money;
			return true;
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}

	public int getBalance() {
		return balance;
	}
}
