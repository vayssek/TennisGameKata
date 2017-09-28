package kata.com.tennis.game.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetTest {
	
	Player player1;
	Player player2;
	Game game;
	Set set;

	@Before
	public void beforeSetTest() {
		player1 = new Player("P1");
		player2 = new Player("P2");
		game = new Game(player1, player2);
		set = new Set(game);
	}
}
