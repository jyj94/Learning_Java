package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		//추상 클래스는 변수 생성 불가 
		//Computer c1 = new Computer();
		Computer c2 = new Desktop();
		//Computer c3 = new Notebook();
		Computer c4 = new MyNotebook();
	}
}
