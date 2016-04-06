package com.gc.oo;

/**
 * @author Maurice Tedder
 * Implementation of motion commands for Tank Robot (with treads).
 */
public class TankRobot extends GenericRobot{

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#forward()
	 */
	@Override
	public void forward() {
		System.out.println("Left and Right tread motors forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#backward()
	 */
	@Override
	public void backward() {
		System.out.println("Left and Right tread motors backwards");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#left()
	 */
	@Override
	public void left() {
		System.out.println("Left tread motor reverse and right tread motor forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#right()
	 */
	@Override
	public void right() {
		System.out.println("Left tread motor forward and right tread motor reverse");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#stop()
	 */
	@Override
	public void stop() {
		System.out.println("Stop both tread motors");
	}
}
