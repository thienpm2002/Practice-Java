package bankDetails;

public abstract class Account {
	protected double balance;
	protected String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public abstract double getBalance();

	public abstract void deposit(double amount);
}
