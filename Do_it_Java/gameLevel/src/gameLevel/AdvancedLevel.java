package gameLevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run fast!");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump higher!");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Can't turn!");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("Advanced level!");
	}

}
