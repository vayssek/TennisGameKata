package kata.com.tennis.game.example;

public class Game {

	private Player player1;
	private Player player2;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getScore() {
		String scoreP1=player1.getScore();
		String scoreP2=player2.getScore();
		return scoreP1+","+scoreP2;
	}

}
