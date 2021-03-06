package gameLevel;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("run slowly!");
	}
	@Override
	public void jump() {
		System.out.println("Can't jump!");
	}
	@Override
	public void turn() {
		System.out.println("can't turn!");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("BeginnerLevel!");
	}
}
