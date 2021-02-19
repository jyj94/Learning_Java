package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("AICar-----");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("ManualCar-----");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
}
