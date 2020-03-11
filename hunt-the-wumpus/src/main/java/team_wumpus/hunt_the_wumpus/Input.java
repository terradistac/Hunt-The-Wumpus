package team_wumpus.hunt_the_wumpus;

import java.util.Scanner;

public class Input {
	private InputConstant inputConstant = new InputConstant();
	private String input;

	
	public Input() {
		Scanner i = new Scanner(System.in); 
		input = i.next(); 
	}
	
	public String retrieveUserInput() {
		return input; 
	}
	
	public boolean validateInput() {
		if (inputConstant.retrieveInputList().contains(input)) {
			return true;
		} 
		return false; 
	}
	public void executeInput() {
		
	}
}
