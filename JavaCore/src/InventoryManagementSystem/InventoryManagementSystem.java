package InventoryManagementSystem;

import java.util.Scanner;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		Inventory<Item> inventory = new Inventory<>();
		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("------------------ Inventory Management System --------------------------");
			System.out.println("1. Views items");
			System.out.println("2. Add item");
			System.out.println("3. Remove item");
			System.out.println("0. Exit");

			System.out.println("Enter choice:");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				inventory.viewItems();
				break;
			}
			case 2: {
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				System.out.println("Enter quantity: ");
				int quantity = sc.nextInt();
				System.out.println("Enter price: ");
				double price = sc.nextDouble();
				sc.nextLine();

				Item newItem = new Item(name.trim(), quantity, price);

				inventory.addItem(newItem);
				break;
			}
			case 3: {
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				Item removeItem = null;
				for (Item i : inventory.getItems()) {
					if (name.equals(i.getName())) {
						removeItem = i;
					}
				}
				if (removeItem == null) {
					System.out.println("Item not found!");
				} else {
					inventory.removeItem(removeItem);
				}
				break;
			}
			case 0: {
				System.out.println("Exit successfully!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} while (choice != 0);

		sc.close();

	}
}
