package com.java.code.assignment.eone;

import org.junit.Assert;

public class Bird extends Animal {

	@Override
	public boolean swim() {
		return true;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean sing() {
		return true;
	}
	
	public int getFlyAnimalCount()
	{
		return 0;
		
	}

}
