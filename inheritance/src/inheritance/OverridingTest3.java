package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "Lee");
		System.out.println("Price that " + customerLee.getCustomerName() + "will pay is " + customerLee.calcPrice(price));
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim", 12345);
		System.out.println("Price that " + customerKim.getCustomerName() + "will pay is " + customerKim.calcPrice(price));
		
		Customer vc = new VIPCustomer(10030, "Nobody", 20000);
		System.out.println("Price that " + vc.getCustomerName() + "will pay is " + vc.calcPrice(price));
		
	}
}
