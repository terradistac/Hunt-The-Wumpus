package team_wumpus.hunt_the_wumpus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import junit.framework.Assert;


public class OutputMessagesTest {
	OutputMessages om = new OutputMessages();
	List<String> sampleData1 = new ArrayList<String>(Arrays.asList("NORTH"));
	List<String> sampleData2 = new ArrayList<String>(Arrays.asList("NORTH", "SOUTH"));
	List<String> sampleData3 = new ArrayList<String>(Arrays.asList("NORTH", "SOUTH", "WEST", "EAST"));
	
	@Test
	public void testNextMove() {
		String out1 = om.nextMove(sampleData1);
		Assert.assertEquals("There is an exit to the NORTH", out1);
		String out2 = om.nextMove(sampleData2);
		Assert.assertEquals("There are exist to the NORTH and SOUTH", out2);
		String out3 = om.nextMove(sampleData3);
		Assert.assertEquals("There are exist to the NORTH and SOUTH and WEST and EAST", out3);
	}
	
	@Test 
	public void testArrowsLeft() {
		String out1 = om.arrowsLeft(5);
		String out2 = om.arrowsLeft(3); 
		Assert.assertEquals("You have 5 arrows left.", out1);
		Assert.assertEquals("You shot an arrow, you now have 3 arrows left.", out2);
		
	}
}
