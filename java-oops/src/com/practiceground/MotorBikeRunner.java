package com.practiceground;

public class MotorBikeRunner {

	public static void main(String args[]) {
		MotorBike honda = new MotorBike();
		MotorBike dukati  = new MotorBike();
		
		honda.start();
		dukati.start();
		honda.setSpeed(10);
		System.out.println("Speed : " + honda.getSpeed());
		
	}
}
