package team_wumpus.hunt_the_wumpus;

import org.junit.Test;

public class AdjacentGridCheckerTest {
	
	@Test
	public void checkerDistinguishesBetweenEmptyAndFilledCaverns() {
		GameMap map = new GameMap(4,4);
		map.openCavern(0, 0);
		AdjacentGridChecker gridChecker = new AdjacentGridChecker(map, 0, 0);
	}

}
