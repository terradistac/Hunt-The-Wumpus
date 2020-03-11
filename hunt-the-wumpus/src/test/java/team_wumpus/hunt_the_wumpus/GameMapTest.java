package team_wumpus.hunt_the_wumpus;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import team_wumpus.hunt_the_wumpus.objects.Player;

public class GameMapTest {
	@Test
	public void canCreateCavern() {
		GameMap map = new GameMap(2, 2);
		assertTrue(map.get(0, 0) == null);
		map.openCavern(0,0);
		assertFalse(map.get(0, 0) == null);
	}
	
	@Test
	public void acceptanceTest1() throws Exception {
		GameMap map = new GameMap(2,2);
		assertTrue(map.get(0, 0) == null);
		assertTrue(map.get(1, 0) == null);
		
		map.openCavern(0, 0);
		map.openCavern(1, 0);
		
		assertFalse(map.get(0, 0) == null);
		assertFalse(map.get(1, 0) == null);
		
		Player player = new Player();
		map.put(player, 0, 0);
		
		assertEquals(0, player.getX());
		assertEquals(0, player.getY());
		
	}

	@Test
	public void movePlayerOutsideGrid() throws Exception {
		Player player = new Player();
		GameMap map = new GameMap(2,2);
		map.openCavern(0, 1);
		map.put(player, 0, 1);
		player.move(Direction.NORTH);
		assertEquals(0, player.getX());
		assertEquals(1, player.getY());
	}
}
