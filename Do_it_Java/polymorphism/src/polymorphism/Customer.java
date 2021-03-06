package polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price* bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "'s grade is " + customerGrade + ", and bonus point is " + bonusPoint;
	}
	
	public void setCustomerID(int num) {
		customerID = num;
	}
	public void setCustomerName(String name) {
		customerName = name;
	}
	public String getCustomerName() {
		return customerName;
	}
}
