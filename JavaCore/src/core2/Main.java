package core2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int mainChoice;
		do {
			System.out.println("---------------------------- Main -----------------------------");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("0. Exit");
			System.out.println("Enter choice:");
			mainChoice = sc.nextInt();
			sc.nextLine();

			switch (mainChoice) {
			case 1: {
				System.out.println("Enter id:");
				long id = sc.nextLong();

				long accountId = bank.login(id);
				if (accountId != -1) {
					int accountChoice;
					do {
						System.out.println("---------------------------- Account with id " + accountId
								+ " -----------------------------");
						System.out.println("1. View balance");
						System.out.println("2. Send money");
						System.out.println("3. Withdraw money");
						System.out.println("4. Transfer money");
						System.out.println("0. Logout");
						System.out.println("Enter choice:");
						accountChoice = sc.nextInt();
						sc.nextLine();

						switch (accountChoice) {
						case 1: {
							bank.viewBalance(accountId);
							break;
						}
						case 2: {
							System.out.println("Enter money");
							long money = sc.nextLong();
							bank.sendMoney(accountId, money);
							break;
						}
						case 3: {
							System.out.println("Enter money");
							long money = sc.nextLong();
							bank.withDrawMoney(accountId, money);
							break;
						}
						case 4: {
							System.out.println("Enter money");
							long money = sc.nextLong();
							sc.nextLine();
							System.out.println("Enter receive id");
							long receiveId = sc.nextLong();

							bank.transferMoney(accountId, receiveId, money);
							break;
						}
						case 0: {
							System.out.println("Logout!");
							break;
						}
						default:
							System.out.println("Please enter choice 0-3");
						}

					} while (accountChoice != 0);
				}

				break;
			}
			case 2: {
				System.out.println("Enter id:");
				long id = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter name:");
				String name = sc.nextLine();

				bank.register(id, name);

				break;
			}
			case 0: {
				System.out.println("Exit!");
				break;
			}
			default:
				System.out.println("Please enter choice 0-2");
			}
		} while (mainChoice != 0);

		sc.close();
	}
}
