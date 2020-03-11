package team_wumpus.hunt_the_wumpus;

import team_wumpus.hunt_the_wumpus.objects.Containable;

public class WumpusCavernDecorator extends CavernDecorator {
	
	public WumpusCavernDecorator(Containable container) {
		this.container = container;
		this.message = "You smell the wumpus";
	}
	
}
