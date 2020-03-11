package team_wumpus.hunt_the_wumpus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import team_wumpus.hunt_the_wumpus.objects.Wumpus;

public class WumpusMovementTest {
	
	@Test
	public void wumpusCanMove() {
		Wumpus wumpus = new Wumpus();
		WumpusMover wumpusMover = new WumpusMover(2,3);
		wumpusMover.initializeWumpusLocation(wumpus);
		
		wumpusMover.moveWumpus(wumpus, Direction.NORTH.getAbbreviation());
		assertEquals(4, wumpus.getY());
	}

}
