package com.gc.nonoo;


import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice Tedder
 * Robot controller application - Allows user to choose the type of robot they want to control.
 * This example DOES NOT use Object Oriented principles.
 * Remember the goal of Object Oriented Programming is:
 * 1. Modular code
 * 2. Reusable
 * 3. Maintainable
 *
 * Questions:
 * 1. Is there a better way to write this same program NOT using Object Oriented design?
 * 2. How much code needs to be changed if we want to add another robot type?
 * 3. Compare this code with the Object Oriented version.
 */
public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Prompt user for robot choice
		System.out.println("Select type of robot:\n1. Tank\n2. Humanoid Robot\n3. Spider Robot");
		int choice = scan.nextInt();
		
		TankRobot tankRobot = null;
		HumanoidRobot humanoidRobot = null;
		SpiderRobot spiderRobot = null;
		// Create robot object type based on user choice
		if (choice == 1) {
			tankRobot = new TankRobot();
		} else if (choice == 2) {
			humanoidRobot = new HumanoidRobot();
		} else if (choice == 3) {
			spiderRobot = new SpiderRobot();
		}

		System.out.println("1. Forward\n2. Backward\n3. Left\n4. Right");
		choice = scan.nextInt();
		// Move robot based on user selection. 
		switch (choice) {
		case 1:// forward
			if(tankRobot != null){
				tankRobot.forward();
			}else if(humanoidRobot != null){
				humanoidRobot.forward();
			}else if(spiderRobot != null){
				spiderRobot.forward();
			}			
			break;
			
		case 2:// Backward
			if(tankRobot != null){
				tankRobot.backward();
			}else if(humanoidRobot != null){
				humanoidRobot.backward();
			}else if(spiderRobot != null){
				spiderRobot.backward();
			}		
			break;

		case 3:// Left
			if(tankRobot != null){
				tankRobot.left();
			}else if(humanoidRobot != null){
				humanoidRobot.left();
			}else if(spiderRobot != null){
				spiderRobot.left();
			}		
			break;

		case 4:// Right
			if(tankRobot != null){
				tankRobot.right();
			}else if(humanoidRobot != null){
				humanoidRobot.right();
			}else if(spiderRobot != null){
				spiderRobot.right();
			}	
			break;

		default:
			if(tankRobot != null){
				tankRobot.stop();
			}else if(humanoidRobot != null){
				humanoidRobot.stop();
			}else if(spiderRobot != null){
				spiderRobot.stop();
			}	
			break;
		}
	}
}
