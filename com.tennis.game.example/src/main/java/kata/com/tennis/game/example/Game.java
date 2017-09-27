package kata.com.tennis.game.example;

public class Game {

	private Player player1;
	private Player player2;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getScore() {
		if ((player1.getScore() > 3 || player2.getScore() > 3)&& Math.abs(player2.getScore() - player1.getScore()) >= 2) {
               return getLeadPlayer().getName() + " won";
            } else if (player1.getScore() > 3 && player2.getScore() > 3 && player1.getScore() == player2.getScore()) {
                return "deuce";
            } else if((player1.getScore() > 3 || player2.getScore() > 3)&&Math.abs(player2.getScore() - player1.getScore()) ==1){
                return "advantage " + getLeadPlayer().getName();
            }else{
		String scoreP1 = player1.getScoreDescription();
		String scoreP2 = player2.getScoreDescription();
		return scoreP1 + "," + scoreP2;
		}
	}

	private Player getLeadPlayer() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}
}
