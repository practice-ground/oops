package com.practiceground;

public class MotorBike {
	
	//State
	private int speed;
	
	
	//behaviour
	void start () {
		System.out.println("Started");
	}
	
	public void setSpeed(int speed) {
		if(speed > 0 ) {
			this.speed += speed;
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
