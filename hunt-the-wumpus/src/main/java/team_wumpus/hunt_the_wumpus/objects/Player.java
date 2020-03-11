package team_wumpus.hunt_the_wumpus.objects;

import team_wumpus.hunt_the_wumpus.Direction;

public class Player implements Moveable {
	
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

	public void move(Direction direction) {
		switch(direction) {
		  case NORTH:
			  this.move(x, y+1);
			  break;
		  case EAST:
			  this.move(x+1, y);
			  break;
		  case SOUTH:
			  this.move(x, y-1);
			  break;
		  case WEST:
			  this.move(x-1, y);
			  break;
		}
	}
		
	private void move(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

}
