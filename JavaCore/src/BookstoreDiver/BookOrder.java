package BookstoreDiver;

public class BookOrder extends Customer {
	private double orderAmount;

	{
		System.out.println("Book Order Details for Customer:");
	}

	public BookOrder(String customerName, String customerId, double orderAmount) {
		super(customerName, customerId);
		// TODO Auto-generated constructor stub
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public void printInfo() {
		System.out.println("Customer Name: " + this.getCustomerName());
		System.out.println("Customer ID: " + this.getCustomerId());
		System.out.println("Order Amount: " + "$" + orderAmount);
	}

}
