package singleton;

public class Factory {
	private static Factory instance = new Factory();
	private static int serialNum = 1000;
	private Factory() {}
	
	public Car createCar() {
		serialNum++;
		Car car = new Car();
		car.setCarNum(serialNum);
		return car;
	}
	
	public static Factory getInstance() {
		return instance;
	}
}
