package team_wumpus.hunt_the_wumpus;

public enum Direction {
	NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
	
	private String abbreviation;
	
	private Direction(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}
}
