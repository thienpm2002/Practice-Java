package core3;

import java.time.LocalDate;

public class Food extends Product {
	private LocalDate expiryDate;

	public Food(long id, String name, int quantity, long price, LocalDate expiryDate) {
		super(id, name, quantity, price);
		this.expiryDate = expiryDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "FOOD";
	}

	@Override
	public long getFinalPrice() {
		if (expiryDate.isBefore(LocalDate.now()))
			return 0;
		return getPrice();
	}

}
