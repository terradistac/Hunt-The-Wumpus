package team_wumpus.hunt_the_wumpus;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import junit.framework.Assert;

public class InputTest {
	
	String sampleInput = "N"; 

	
	@Test
	public void testValidateInput() {
		InputStream in = new ByteArrayInputStream(sampleInput.getBytes());
		System.setIn(in);
		Input input = new Input();
		String testData = input.retrieveUserInput();
		Assert.assertEquals("N", testData); 
		Assert.assertEquals(true,  input.validateInput());
	}
}
