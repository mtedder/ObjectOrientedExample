package com.gc.nonoo;

/**
 * @author Maurice Tedder
 * Implementation of motion commands for SpiderRobot/Hexapod (with 6 legs).
 */
public class SpiderRobot{

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#forward()
	 */	
	public void forward() {
		System.out.println("Move left legs forward then right legs forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#backward()
	 */	
	public void backward() {
		System.out.println("Move left legs backward then right legs backward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#left()
	 */	
	public void left() {
		System.out.println("Move left legs back and right legs forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#right()
	 */	
	public void right() {
		System.out.println("Move left legs right then right legs back");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#stop()
	 */	
	public void stop() {
		System.out.println("Stop all 6 legs");
	}
}
