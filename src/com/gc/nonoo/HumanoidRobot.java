package com.gc.nonoo;

/**
 * @author Maurice Tedder
 * Implementation of motion commands for HumanoidRobot (with legs).
 */
public class HumanoidRobot{

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#forward()
	 */	
	public void forward() {
		System.out.println("Move left leg forward then right leg forward");
	}
	
	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#backward()
	 */	
	public void backward() {
		System.out.println("Move left leg backward then right leg backward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#left()
	 */	
	public void left() {
		System.out.println("Move left leg back and right leg forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#right()
	 */	
	public void right() {
		System.out.println("Move left leg right then right leg back");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#stop()
	 */	
	public void stop() {
		System.out.println("Stop left leg and right leg");
	}
}
