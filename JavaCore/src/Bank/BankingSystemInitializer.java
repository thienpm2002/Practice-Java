package Bank;

public class BankingSystemInitializer {
	private String bankId;
	private String bankName;
	private String bankBalance;

	// static initializer block
	static {
		System.out.println("initialization process has begun");
	}

	// anonymous (instance) initializer block
	{
		System.out.println("Banking Process has started,");
	}

	public BankingSystemInitializer(String bankId, String bankName, String bankBalance) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankBalance = bankBalance;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(String bankBalance) {
		this.bankBalance = bankBalance;
	}

	public void printBankDetails() {
		System.out.println("Bank Details are:");
		System.out.println("Bank Id: " + bankId);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Bank Balance: " + bankBalance);
		System.out.println("Thank YOU for using Fedral Bank of India.");
	}

}
