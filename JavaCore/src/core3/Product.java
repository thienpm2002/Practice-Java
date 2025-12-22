package core3;

public abstract class Product {
	private long id;
	private String name;
	private int quantity;
	private long price;

	public Product(long id, String name, int quantity, long price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	protected long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected long getPrice() {
		return price;
	}

	protected void setPrice(long price) {
		this.price = price;
	}

	public abstract String getCategory();

	public abstract long getFinalPrice();

	@Override
	public int hashCode() {
		return Long.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

}
