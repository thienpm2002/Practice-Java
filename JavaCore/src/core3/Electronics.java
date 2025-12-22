package core3;

public class Electronics extends Product {
	private int warrantyMonths;

	public Electronics(long id, String name, int quantity, long price, int warrantyMonths) {
		super(id, name, quantity, price);
		this.warrantyMonths = warrantyMonths;
	}

	public int getWarrantyMonths() {
		return warrantyMonths;
	}

	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Electronics";
	}

	@Override
	public long getFinalPrice() {
		// TODO Auto-generated method stub
		return getPrice() + warrantyMonths * 10000;
	}

}
