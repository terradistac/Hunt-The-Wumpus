package team_wumpus.hunt_the_wumpus;

import team_wumpus.hunt_the_wumpus.objects.Cavern;
import team_wumpus.hunt_the_wumpus.objects.Containable;

public class GameMap {
	private int width;
	private int height;
	
	Containable[][] map;
	
	public GameMap(int width, int height) {
		this.width = width;
		this.height = height;
		
		map = new Containable[width][height];	
	}

	public Containable get(int x, int y) {
		return map[x][y];	
	}

	public void openCavern(int x, int y) {
		map[x][y] = new Cavern();	
	}
	
	
}
