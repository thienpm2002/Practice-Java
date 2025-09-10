package bankDetails;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numberCount = s.nextLine();
		double interestRate = s.nextDouble();
		s.nextLine();
		double balance = s.nextDouble();
		s.nextLine();
		SavingsAccount account = new SavingsAccount(numberCount, interestRate);
		account.deposit(balance);
		account.printInfo();
		System.out.println("Balance in savings account: " + account.getBalance());
		s.close();
	}
}
