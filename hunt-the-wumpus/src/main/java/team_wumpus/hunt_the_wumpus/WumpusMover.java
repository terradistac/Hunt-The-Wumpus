package team_wumpus.hunt_the_wumpus;

import team_wumpus.hunt_the_wumpus.objects.Wumpus;

public class WumpusMover {
	
	int validStartingX;
	int validStartingY;
	
	public WumpusMover(int validStartingX, int validStartingY) {
		this.validStartingX = validStartingX;
		this.validStartingY = validStartingY;
	}

	public Wumpus initializeWumpusLocation(Wumpus wumpus) {
		wumpus.setX(validStartingX);
		wumpus.setY(validStartingY);
		
		return wumpus;
	}

	public void moveWumpus(Wumpus wumpus, String direction) {
		switch (direction) {
		case "N":
			wumpus.setY(wumpus.getY() + 1);
		break;
		case "E":
			wumpus.setX(wumpus.getX() + 1);
		break;
		case "W":
			wumpus.setX(wumpus.getX() - 1);
		break;
		case "S":
			wumpus.setY(wumpus.getY() - 1);
		break;
		}
	}

}
