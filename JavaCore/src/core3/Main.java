package core3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Store store = new Store();
		int choice;
		do {
			System.out.println("----------------------- Menu ----------------------");
			System.out.println("1. Food");
			System.out.println("2. Electronics");
			System.out.println("3. View cart");
			System.out.println("4. Order");
			System.out.println("5. List Order");
			System.out.println("0. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				int fChoice;
				do {
					store.foodMenu();
					System.out.println("Enter food choice of order (Choice 0 of return): ");
					fChoice = sc.nextInt();
					sc.nextLine();
					switch (fChoice) {
					case 1: {
						System.out.println("Enter quantity: ");
						int quantity = sc.nextInt();
						try {
							store.addToCart("Pizza", quantity);
							System.out.println("Add " + quantity + " Pizza to cart successfully!");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println(e.getMessage());
						}
						break;
					}
					case 2: {
						System.out.println("Enter quantity: ");
						int quantity = sc.nextInt();
						try {
							store.addToCart("Banh my", quantity);
							System.out.println("Add " + quantity + " Banh my to cart successfully!");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println(e.getMessage());
						}
						break;
					}
					case 0: {
						break;
					}
					default:
						System.out.println("Enter food choice invlaid!");
					}

				} while (fChoice != 0);
				break;
			}
			case 2: {
				int eChoice;
				do {
					store.electronicMenu();
					System.out.println("Enter electronic choice of order (Choice 0 of return): ");
					eChoice = sc.nextInt();
					sc.nextLine();
					switch (eChoice) {
					case 1: {
						System.out.println("Enter quantity: ");
						int quantity = sc.nextInt();
						try {
							store.addToCart("Laptop", quantity);
							System.out.println("Add " + quantity + " Laptop to cart successfully!");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println(e.getMessage());
						}
						break;
					}
					case 2: {
						System.out.println("Enter quantity: ");
						int quantity = sc.nextInt();
						try {
							store.addToCart("IPhone", quantity);
							System.out.println("Add " + quantity + " IPhone to cart successfully!");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println(e.getMessage());
						}
						break;
					}
					case 0: {
						break;
					}
					default:
						System.out.println("Enter electronic choice invlaid!");
					}
				} while (eChoice != 0);
				break;
			}
			case 3: {
				store.viewCart();
				break;
			}
			case 4: {
				store.order();
				break;
			}
			case 5: {
				store.listOrder();
				break;
			}
			case 0: {
				System.out.println("Exit!");
				break;
			}

			default:
				System.out.println("Enter choice invlaid!");
			}

		} while (choice != 0);

		sc.close();

	}
}
