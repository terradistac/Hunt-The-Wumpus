package team_wumpus.hunt_the_wumpus;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameMapTest {
	@Test
	public void startSquareIsEmpty() {
		GameMap map = new GameMap(2, 2);
		assertTrue(map.get(0, 0) == null);
		map.openCavern(0,0);
		assertFalse(map.get(0, 0) == null);
	}

}
