package com.java.code.assignment.onea;

import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for simple AnimalServiceTest.
 */
public class AnimalServiceTest 

{

	private Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}

	@Test
	public void tesWalk()
	{
		bird.walk();
	}
}
