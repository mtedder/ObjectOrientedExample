package com.gc.oo;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice Tedder Robot controller application - Allows user to choose
 *         the type of robot they want to control. This example uses Object
 *         Oriented principles of Polymorphism (using inheritance) and method
 *         overloading.
 *
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

		GenericRobot robot = null;// super/parent class
		// Create robot object type based on user choice
		if (choice == 1) {
			robot = new TankRobot();
		} else if (choice == 2) {
			robot = new HumanoidRobot();
		} else if (choice == 3) {
			robot = new SpiderRobot();
		}

		System.out.println("1. Forward\n2. Backward\n3. Left\n4. Right");
		choice = scan.nextInt();
		// Move robot based on user selection. 
		switch (choice) {
		case 1:// forward
			robot.forward();
			break;
			
		case 2:// Backward
			robot.backward();
			break;

		case 3:// Left
			robot.left();
			break;

		case 4:// Right
			robot.right();
			break;

		default:
			robot.stop();
			break;
		}
	}
}
