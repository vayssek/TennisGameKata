package kata.com.tennis.game.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetTest {
	
	private static int[] BEGINNING_SCORE= {0,0};
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
	
	@Test
	public void zeroShouldBeDescriptionForScore0() {
		Game game = new Game(player1, player2);
		set = new Set(game);
		assertArrayEquals(BEGINNING_SCORE, set.getScore());
	}
}
