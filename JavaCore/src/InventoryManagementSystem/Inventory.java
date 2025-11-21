package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
	private List<T> items;

	public Inventory() {
		this.items = new ArrayList<>();
	}

	public void addItem(T item) {
		items.add(item);
		System.out.println("Item added successfully");
	}

	public void removeItem(T item) {
		items.remove(item);
		System.out.println("Item removed successfully");
	}

	public void viewItems() {
		if (items.size() == 0) {
			System.out.println("Inventory is empty!");
		} else {
			for (T item : items) {
				System.out.println("------------------------------------------------------");
				System.out.println(item.toString());
			}
		}
	}

	public List<T> getItems() {
		return items;
	}
}
