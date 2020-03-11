package team_wumpus.hunt_the_wumpus;

import java.util.List;

public class OutputMessages {

	public String start() {
		return "Welcome! Please make a move.";
	}
	public String error() {
		return "Invalid input. Please try again.";
	}
	public String wumpus() {
		return "You smell the Wumpus.";
	}
	public String bat() {
		return "You hear chirping.";
	}
	public String killedByWumpus() {
		return "Game over. You got killed by the wumpus.";
	}
	public String killedByArrow() {
		return "Game over. You got killed by your arrow.";
	}
	public String killTheWumpus() {
		return "Game over. You killed the wumpus!";
	}
	public String pickedUpByBat() {
		return "A bat picked you up and dropped you off randomly.";
	}
	public String pickUpArrow() {
		return "You picked up an arrow.";
	}
	public String arrowHitWall() {
		return "Your arrow hit the end of the cavern and landed on the floor.";
	}
	public String nextMove(List<String> directions) {
		if(directions.size()==1) return "There is an exit to the " + directions.get(0); 
		String msg = ""; 
		for (int i = 0; i < directions.size()-1; i++) {
			 msg = msg + directions.get(i) + " and "; 
		}
		msg = msg + directions.get(directions.size()-1);
		return "There are exist to the " + msg;		
	}
	public String arrowsLeft(int arrowNum) {
		if (arrowNum == 5) return "You have 5 arrows left.";
		return "You shot an arrow, you now have " + arrowNum + " arrows left."; 
	}

}
