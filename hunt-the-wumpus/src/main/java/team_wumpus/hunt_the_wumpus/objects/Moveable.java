package team_wumpus.hunt_the_wumpus.objects;

import team_wumpus.hunt_the_wumpus.Direction;

public interface Moveable {
	
	public int getX();
	
	public int getY();
	
	public void setX(int x);
	
	public void setY(int y);
	
	public default void move(Direction direction) {
		switch(direction) {
		  case NORTH:
			  this.move(getX(), getY()+1);
			  break;
		  case EAST:
			  this.move(getX()+1, getY());
			  break;
		  case SOUTH:
			  this.move(getX(), getY()-1);
			  break;
		  case WEST:
		      this.move(getX()-1, getY());
		  break;
		}
	}
	
	
	public default void move(int x, int y) {
		setX(x);
		setY(y);
	}
}
