package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Running only");
	}

	@Override
	public void jump() {
		System.out.println("Cannot jump");
	}

	@Override
	public void turn() {
		System.out.println("Cannot turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***Begginer Level***");
	}

}
