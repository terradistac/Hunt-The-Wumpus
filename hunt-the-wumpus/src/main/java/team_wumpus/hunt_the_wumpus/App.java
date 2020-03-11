package team_wumpus.hunt_the_wumpus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import team_wumpus.hunt_the_wumpus.objects.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	GameMap map = new GameMap(2,2);
    	
		map.openCavern(0, 0);
		map.openCavern(1, 0);
		System.out.println("Generate map");
		
		System.out.println("There is a " + map.get(0,0) + " at (0,0)");
		System.out.println("There is a " + map.get(1,0) + " at (1,0)");
		System.out.println("There is a " + map.get(0,1) + " at (0,1)");
		System.out.println("There is a " + map.get(1,1) + " at (1,1)");
		
		Player player = new Player();
		map.put(player, 0, 0);
		System.out.println("There is a person at (" + player.getX() + "," + player.getY() + ")");
		player.move(Direction.EAST);
		System.out.println("Move Player East");
		System.out.println("There is a person at (" + player.getX() + "," + player.getY() + ")");
    }
}
