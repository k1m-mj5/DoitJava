package gamelevel;

public class MainBoard {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLeve(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLeve(sLevel);
		player.play(3);
	}

}
