package core3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
	private List<Product> products;
	private List<Order> orders;
	private Map<Product, Integer> cart = new HashMap<>();

	public Store() {
		super();
		this.orders = new ArrayList<>();
		this.products = List.of(new Food(1, "Pizza", 10, 100000, LocalDate.of(2025, 12, 25)),
				new Food(2, "Banh my", 20, 25000, LocalDate.of(2025, 12, 23)),
				new Electronics(3, "Laptop", 10, 6000000, 6), new Electronics(4, "IPhone", 20, 5000000, 3));
	}

	public void foodMenu() {
		int cnt = 1;
		System.out.println("STT " + "Name " + " Price");
		for (Product p : products) {
			if (p.getCategory().equals("FOOD")) {
				System.out.println(cnt++ + ". " + p.getName() + " " + p.getPrice());
			}
		}
	}

	public void electronicMenu() {
		int cnt = 1;
		System.out.println("STT " + "Name " + " Price");
		for (Product p : products) {
			if ("Electronics".equals(p.getCategory())) {
				System.out.println(cnt++ + ". " + p.getName() + " " + p.getPrice());
			}
		}
	}

	public void addToCart(String name, int quantity) {
		for (Product p : products) {
			if (p.getName().equals(name)) {
				if (p.getQuantity() < quantity) {
					throw new RuntimeException("Quantity invalid!");
				}
				cart.put(p, cart.getOrDefault(p, 0) + quantity);
				p.setQuantity(p.getQuantity() - quantity);
			}
		}
	}

	public void viewCart() {
		int cnt = 1;
		System.out.println("STT " + "Name " + " Quantity");
		for (Map.Entry<Product, Integer> e : cart.entrySet()) {
			System.out.println(cnt++ + ". " + e.getKey().getName() + " " + e.getValue());
		}
	}

	public void order() {
		if (cart.size() != 0) {
			Order o = new Order((long) orders.size() + 1, new HashMap<>(cart));
			orders.add(o);
			cart.clear();
			o.printOrder();
		} else {
			System.out.println("Products empty");
		}
	}

	public void listOrder() {
		for (int i = 0; i < orders.size(); i++) {
			orders.get(i).printOrder();
		}

	}
}
