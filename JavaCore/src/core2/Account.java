package core2;

public class Account {
	private long id;
	private String name;
	private long balance = 100;

	public Account(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public synchronized void deposit(long money) {
		if (money <= 0) {
			throw new IllegalArgumentException("Money invalid");
		}
		balance += money;
	}

	public synchronized void withdraw(long money) {
		if (money <= 0 || money > balance) {
			throw new IllegalArgumentException("Money invalid");
		}
		balance -= money;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
