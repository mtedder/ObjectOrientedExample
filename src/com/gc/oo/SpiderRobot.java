package com.gc.oo;

/**
 * @author Maurice Tedder
 * Implementation of motion commands for SpiderRobot/Hexapod (with 6 legs).
 */
public class SpiderRobot extends GenericRobot {

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#forward()
	 */
	@Override
	public void forward() {
		System.out.println("Move left legs forward then right legs forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#backward()
	 */
	@Override
	public void backward() {
		System.out.println("Move left legs backward then right legs backward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#left()
	 */
	@Override
	public void left() {
		System.out.println("Move left legs back and right legs forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#right()
	 */
	@Override
	public void right() {
		System.out.println("Move left legs right then right legs back");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#stop()
	 */
	@Override
	public void stop() {
		System.out.println("Stop all 6 legs");
	}
}
