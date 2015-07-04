package com.bluefly.assignment;

/**
 * @author Ankur Sinha
 * 
 * CrewMemberInfo class sets a crew member's
 * cell number. It also assigns a crew member 
 * as a special member (i.e. Tally Keeper). After
 * the tally keeper is assigned it sets isCrewMemTK to true.
 *
 */
class CrewMemberInfo {

	/* Array of Crew Member's cell numbers */
	private int crewMemNum[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
	
	/* Crew Member's cell number */
	private int crewMemCount[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	/* Flag for crew member who is a Tally Keeper */
	private boolean isCrewMemTK = false;
	
	/* Tally Keeper's cell number */
	final int SET_CREW_MEM_TK_NUM = 23;

	/**
	 * @return the crewMemNum
	 */
	int[] getCrewMemNum() {
		return crewMemNum;
	}

	/**
	 * @param crewMemNum the crewMemNum to set
	 */
	void setCrewMemNum(int crewMemNum) {
		
		/** 
		  * Sets isCrewMemTK to true if 
		  * crew member's cell number selected by
		  * pirate is equal to assigned Tally Keeper
		  * crew member's cell number  
		  */
		  if (crewMemNum == SET_CREW_MEM_TK_NUM)
		  {
			this.isCrewMemTK = true;
		  }
		  else
		  {
			  this.isCrewMemTK = false;
		  }
	}
	
	
	/**
	 * @return the crewMemCount
	 */
	int[] getCrewMemCount() {
		return crewMemCount;
	}

	/**
	 * @param crewMemCount the crewMemCount to set
	 */
	void setCrewMemCount(int crewMemCount) {
		
		try
		{
			if (this.crewMemCount[crewMemCount] == 0 ||
					this.crewMemCount[crewMemCount] == 1) 
			{
				this.crewMemCount[crewMemCount]++; 
			}
			else
			{
				this.crewMemCount[crewMemCount] = 0;
			}
		} catch(ArrayIndexOutOfBoundsException ae){
	    	throw new ArrayIndexOutOfBoundsException();
	    } 
	}

	/**
	 * @return the isCrewMemTK
	 */
	boolean isCrewMemTK() {
		return isCrewMemTK;
	}
	
}
