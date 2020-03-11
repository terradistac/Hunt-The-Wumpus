package team_wumpus.hunt_the_wumpus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import team_wumpus.hunt_the_wumpus.objects.Wumpus;

public class CavernDecoratorTest {
	
	@Test
	public void cavernDecorator_ReturnsCavernsWithAWumpus() {
		Wumpus wumpus = new Wumpus();
		GameMap map = new GameMap(2, 2);
		map.openCavern(0, 0);
		
		wumpus.move(0, 0);
		CavernDecorator decoratedCavern = new WumpusCavernDecorator(map.get(0, 0));
		assertEquals("You smell the wumpus", decoratedCavern.getMessage());
	}

}
