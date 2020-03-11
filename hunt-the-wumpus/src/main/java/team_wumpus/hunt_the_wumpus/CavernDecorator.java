package team_wumpus.hunt_the_wumpus;

import team_wumpus.hunt_the_wumpus.objects.Containable;

public abstract class CavernDecorator implements Containable {
	protected Containable container;
	protected String message;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
