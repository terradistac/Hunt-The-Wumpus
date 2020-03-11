package team_wumpus.hunt_the_wumpus.objects;

import team_wumpus.hunt_the_wumpus.Direction;

public class Wumpus implements Moveable {
	
	private int x;
	private int y;

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
