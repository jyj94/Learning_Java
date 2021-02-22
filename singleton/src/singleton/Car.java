package singleton;

public class Car {
	private int serialNum;
	
	public void setCarNum(int num) {
		serialNum = num;
	}
	public String getCarNum() {
		return Integer.toString(serialNum);
	}
}