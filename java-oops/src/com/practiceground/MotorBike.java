package com.practiceground;

public class MotorBike {
	
	//State
	private int speed;
	
	MotorBike(){
		this(20);
	}
	
	MotorBike(int speed) {
		this.speed = speed;
	}
	
	//behaviour
	void start () {
		System.out.println("Started");
	}
	
	public void setSpeed(int speed) {
		if(speed >= 0 ) {
			this.speed += speed;
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int decreaseSpeed(int speed) {
		if (speed <= this.speed && speed >=0) { 
			this.speed -= speed;
		}
		return getSpeed();
	}
}
