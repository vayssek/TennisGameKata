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
		assertEquals("15,0", game.getScore());
	}

	@Test
	public void fifteenForEachShouldBeDescriptionForScore1() {
		player1.winBall();
		player2.winBall();
		assertEquals("15,15", game.getScore());
	}

	@Test
	public void thirteenShouldBeDescriptionForScore2() {
		player1.winBall();
		player1.winBall();
		assertEquals("30,0", game.getScore());
	}

	@Test
	public void fortyShouldBeDescriptionForScore3() {
		player1.winBall();
		player1.winBall();
		player1.winBall();
		assertEquals("40,0", game.getScore());
	}

	@Test
	public void wonShouldBeDescriptionForScore4() {
		player1.winBall();
		player1.winBall();
		player1.winBall();
		player1.winBall();
		assertEquals("P1 won", game.getScore());
	}

	@Test
	public void advantageShouldBeDescriptionWhenLeastThreePointsHaveNeenScoredByEachSideAndPlayerHasOnePointMoreThanHisOpponent() {
		player1.winBall();
		player1.winBall();
		player1.winBall();
		player2.winBall();
		player2.winBall();
		player2.winBall();
		player2.winBall();
		assertEquals("advantage P2",game.getScore());
	}

	@Test
	public void deuceShouldBeDescriptionWhenAtLeastThreePointsHaveBeenScoredByEachPlayerAndTheScoresAreEqual() {
		player1.winBall();
		player1.winBall();
		player1.winBall();
		player2.winBall();
		player2.winBall();
		player2.winBall();
		assertEquals("deuce",game.getScore());
	}
	
	@Test
	public void wonShouldBeTheDescriptionOnlyIfPlayersAreSeparetedByTwoPointsWhenFortyIsReachedByBoth() {
		player1.winBall();
		player1.winBall();
		player1.winBall();
		player2.winBall();
		player2.winBall();
		player2.winBall();
		assertEquals("deuce",game.getScore());
		player2.winBall();
		assertEquals("advantage P2",game.getScore());
		player1.winBall();
		assertEquals("deuce",game.getScore());
		player1.winBall();
		assertEquals("advantage P1",game.getScore());
		player1.winBall();
		assertEquals("P1 won", game.getScore());
	}

}
