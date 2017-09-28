package kata.com.tennis.game.example;

import java.util.Arrays;
import java.util.List;

public class Player {
	
	private String name;
	protected static final List<String> scoreDescription = Arrays.asList("0", "15","30","40");
	private int score;
 
	public Player(String name) {
		this.setName(name);
		this.setScore(0);
	}

	public String getScoreDescription() {
		
		return scoreDescription.get(getScore());
	}

	public void winBall() {
		this.score=score+1;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}
