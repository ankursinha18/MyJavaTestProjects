package com.bluefly.assignment;

/**
 * @author Ankur Sinha
 * 
 * SwitchInfo class sets state of the left switch
 * using isLeftSwitchState flag
 *  
 */
class SwitchInfo {
	
	/* Flag setting Left switch state */
	private boolean isLeftSwitchState = true;


	/**
	 * @param isLeftSwitchState the isLeftSwitchState to set
	 */
	void setLeftSwitchState(boolean isLeftSwitchState) {
		this.isLeftSwitchState = isLeftSwitchState;
	}


	/**
	 * @return the isLeftSwitchState
	 */
	boolean isLeftSwitchState() {
		return isLeftSwitchState;
	}

}
