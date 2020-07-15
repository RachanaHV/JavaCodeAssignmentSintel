package com.java.code.assignment.done;



public class Caterpillar extends Animal implements FlyBehaviourIF{

	private FlyBehaviourIF flyBehaviour;
	private SoundBehaviourIF soundBehaviour;

	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviourIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public void performAction(){
	  flyBehaviour.fly();
	  soundBehaviour.sound();
	}

	public String fly() {
		System.out.println("Caterpillar can not fly");
		return "Caterpillar can not fly";
	}
	
	 
	
}
