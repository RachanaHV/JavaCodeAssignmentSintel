package com.java.code.assignment.done;

public class Butterfly implements FlyBehaviourIF,SoundBehaviourIF{

	public String fly() {
		System.out.println("Butterfly can fly");
		return "Butterfly can fly";
	}

	public String sound() {
		System.out.println("Butterfly does not make a sound");
		return "Butterfly does not make a sound";
	}

}
