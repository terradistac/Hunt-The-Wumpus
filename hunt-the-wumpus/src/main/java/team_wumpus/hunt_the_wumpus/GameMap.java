package team_wumpus.hunt_the_wumpus;

import team_wumpus.hunt_the_wumpus.objects.Cavern;
import team_wumpus.hunt_the_wumpus.objects.Containable;
import team_wumpus.hunt_the_wumpus.objects.Player;

public class GameMap {
	private int width;
	private int height;
	
	private Containable[][] map;
	
	public GameMap(int width, int height) {
		this.width = width;
		this.height = height;
		
		map = new Containable[width][height];	
	}

	public Containable get(int x, int y) {
		return map[x][y];	
	}
	
	public void put(Player player, int x, int y) throws Exception {
		if (map[x][y] == null) {
			throw new Exception();
		}
		player.setX(x);
		player.setY(y);		
	}
	
	public void openCavern(int x, int y) {
		map[x][y] = new Cavern();	
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Containable[][] getMap() {
		return map;
	}

	public void setMap(Containable[][] map) {
		this.map = map;
	}
}
