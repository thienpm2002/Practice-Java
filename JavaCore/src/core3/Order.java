package core3;

import java.time.LocalDateTime;
import java.util.Map;

public class Order {
	private LocalDateTime orderDate;
	private long id;
	private Map<Product, Integer> prodcuts;

	public Order(long id, Map<Product, Integer> prodcuts) {
		super();
		this.id = id;
		this.orderDate = LocalDateTime.now();
		this.prodcuts = prodcuts;
	}

	public Map<Product, Integer> getProdcuts() {
		return prodcuts;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public long getId() {
		return id;
	}

	public void printOrder() {
		System.out.println("-------------- Oder " + id + " -----------------");
		int cnt = 1;
		long totalOrder = 0;
		for (Map.Entry<Product, Integer> e : prodcuts.entrySet()) {
			System.out.println(cnt++ + ". " + e.getKey().getName() + " " + e.getValue());
			totalOrder += e.getKey().getFinalPrice() * e.getValue();
		}
		System.out.println("Total: " + totalOrder + " Date: " + orderDate);
	}

}
