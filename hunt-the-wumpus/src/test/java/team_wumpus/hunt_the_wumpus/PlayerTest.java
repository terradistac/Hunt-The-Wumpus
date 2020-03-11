package team_wumpus.hunt_the_wumpus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import team_wumpus.hunt_the_wumpus.objects.Player;

public class PlayerTest {
	@Test (expected = Exception.class)
	public void createPlayerAtInvalidLocation() throws Exception {
		Player player = new Player();
		GameMap map = new GameMap(2,2);
		map.put(player, 0, 0);		
	}
	
	@Test
	public void createPlayerAtValidLocation() throws Exception{
		Player player = new Player();
		GameMap map = new GameMap(2,2);
		map.openCavern(1, 1);
		map.put(player, 1, 1);
		assertEquals(1, player.getX());
		assertEquals(1, player.getY());
	}
	
	@Test
	public void movePlayerEW() throws Exception {
		Player player = new Player();
		GameMap map = new GameMap(2,2);
		map.openCavern(0, 0);
		map.openCavern(1, 0);
		map.put(player, 0, 0);
		player.move(Direction.EAST);
		assertEquals(1, player.getX());
		assertEquals(0, player.getY());
		player.move(Direction.WEST);
		assertEquals(0, player.getX());
		assertEquals(0, player.getY());
	}
	
	@Test
	public void movePlayerSENW() throws Exception {
		Player player = new Player();
		GameMap map = new GameMap(2,2);
		map.openCavern(0, 0);
		map.openCavern(1, 0);
		map.openCavern(1, 1);
		map.openCavern(0, 1);
		map.put(player, 0, 1);
		player.move(Direction.SOUTH);
		assertEquals(0, player.getX());
		assertEquals(0, player.getY());
		player.move(Direction.EAST);
		assertEquals(1, player.getX());
		assertEquals(0, player.getY());
		player.move(Direction.NORTH);
		assertEquals(1, player.getX());
		assertEquals(1, player.getY());
		player.move(Direction.WEST);
		assertEquals(0, player.getX());
		assertEquals(1, player.getY());
	}
	
	@Test
	public void restPlayer() throws Exception {
		Player player = new Player();
		GameMap map = new GameMap(2,2);
		map.openCavern(0, 0);
		map.put(player, 0, 0);
		player.rest();
		assertEquals(0, player.getX());
		assertEquals(0, player.getY());
	}
	
//	@Test
//	public void movePlayerToClosedSquare() throws Execption() {
//		
//	}
}
