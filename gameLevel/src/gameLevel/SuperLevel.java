package gameLevel;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("run super fast!");
	}
	@Override
	public void jump() {
		System.out.println("jump very high!");
	}
	@Override
	public void turn() {
		System.out.println("turn around!");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("Super level!");
	}
}
