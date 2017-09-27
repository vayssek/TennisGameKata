package kata.com.tennis.game.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

	Player player1;
	Player player2;
	Game game;

	@Before
	public void beforeGameTest() {
		player1 = new Player("P1");
		player2 = new Player("P2");
		game = new Game(player1, player2);
	}

	@Test
	public void zeroShouldBeDescriptionForScore0() {
		Game game = new Game(player1, player2);
		assertEquals("0,0", game.getScore());
	}

	@Test
	public void fifteenShouldBeDescriptionForScore1() {
		player1.winBall();
		assertEquals("15,0",game.getScore());
	}

}
