package team_wumpus.hunt_the_wumpus;

import java.util.HashSet;


public class InputConstant {
	private HashSet<String> inputList = new HashSet<String>();

	public InputConstant() {
		inputList.add("N");
		inputList.add("S");
		inputList.add("W");
		inputList.add("E");
		inputList.add("R");
		inputList.add("SN");
		inputList.add("SS");
		inputList.add("SW");
		inputList.add("SE");
	}
	
	public HashSet<String> retrieveInputList() {
		return inputList; 
	}
}
