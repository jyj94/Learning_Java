package template;

public class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율 수행 수행 ");
		System.out.println("자율 방향 전환 ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춤 ");
	}
	
}
