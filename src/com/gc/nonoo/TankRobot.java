package com.gc.nonoo;

/**
 * @author Maurice Tedder
 * Implementation of motion commands for Tank Robot (with treads).
 */
public class TankRobot{

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#forward()
	 */	
	public void forward() {
		System.out.println("Left and Right tread motors forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#backward()
	 */
	public void backward() {
		System.out.println("Left and Right tread motors backwards");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#left()
	 */	
	public void left() {
		System.out.println("Left tread motor reverse and right tread motor forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#right()
	 */	
	public void right() {
		System.out.println("Left tread motor forward and right tread motor reverse");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#stop()
	 */	
	public void stop() {
		System.out.println("Stop both tread motors");
	}
}
