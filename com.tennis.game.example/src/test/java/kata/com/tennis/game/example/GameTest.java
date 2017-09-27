package kata.com.tennis.game.example;

import org.junit.Before;

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
}
