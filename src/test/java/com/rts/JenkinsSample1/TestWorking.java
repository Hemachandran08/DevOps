package com.rts.JenkinsSample1;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestWorking {
	
	Working w1 = new Working();

	@Test
	public void testAddToLog1()
	{
		assertEquals("Added Log For Romeo", w1.addToLong("Romeo"));
	}
	
	@Test
	public void testAddToLog2()
	{
		assertEquals("Added Log For Juliet", w1.addToLong("Juliet"));
	}
	
	@Test
	public void testAddToLogins1()
	{
		assertEquals("Added Login Log For Master", w1.addLogins("Master"));
	}
	
	@Test
	public void testAddToLogins2()
	{
		assertEquals("Added Login Log For Bhavani", w1.addLogins("Bhavani"));
	}
}
