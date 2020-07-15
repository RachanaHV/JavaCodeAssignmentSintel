package com.java.code.assignment.afour;

import org.junit.Assert;
import org.junit.Test;



public class ParrotServiceTest {
	
	@Test
	public void testRoosterSound(){
		Parrot parrot = new Parrot();
		parrot.setSoundBehaviour(new DogSound());
		Assert.assertEquals("Woof, woof", parrot.performSound());
		parrot.setSoundBehaviour(new DuckSound());
		Assert.assertEquals("Quack, quack", parrot.performSound());
		parrot.setSoundBehaviour(new CatSound());
		Assert.assertEquals("Meow", parrot.performSound());
		parrot.setSoundBehaviour(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo", parrot.performSound());
		parrot.setSoundBehaviour(new PhoneSound());
		//Assert.assertEquals("", parrot.performSound());
	}

}
