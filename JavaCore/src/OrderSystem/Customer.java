package OrderSystem;

public class Customer {
	private String name;
	private ShoppingCart cart;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public Customer(String name) {
		super();
		this.name = name;
		this.cart = new ShoppingCart();
	}

}
