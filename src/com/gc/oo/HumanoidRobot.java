package com.gc.oo;

/**
 * @author Maurice Tedder
 * Implementation of motion commands for HumanoidRobot (with legs).
 */
public class HumanoidRobot extends GenericRobot{

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#forward()
	 */
	@Override
	public void forward() {
		System.out.println("Move left leg forward then right leg forward");
	}
	
	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#backward()
	 */
	@Override
	public void backward() {
		System.out.println("Move left leg backward then right leg backward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#left()
	 */
	@Override
	public void left() {
		System.out.println("Move left leg back and right leg forward");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#right()
	 */
	@Override
	public void right() {
		System.out.println("Move left leg right then right leg back");
	}

	/* (non-Javadoc)
	 * @see com.gc.nonoo.GenericRobot#stop()
	 */
	@Override
	public void stop() {
		System.out.println("Stop left leg and right leg");
	}
}
