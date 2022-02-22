package gamelevel;

public class AdvancedLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("Run fast");
	}

	@Override
	public void jump() {
		System.out.println("Jump higher");
	}

	@Override
	public void turn() {
		System.out.println("Cannot turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***Advanced Level***");
	}

}
