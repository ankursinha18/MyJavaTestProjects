package com.bluefly.assignment;

import java.util.Scanner;

/**
 * @author Ankur Sinha
 * 
 * PirateCrewMemGame class is for playing the
 * game which crew members have been told to play with
 * the pirates post-capturing of their ship. 
 *
 */
public class PirateCrewMemGame {

	public static void main(String[] args) {
		
		System.out.println("Game starts");
		System.out.println("Warden, start picking up crew member randomly ");
		
		/* Start playing the game*/
		playGame();
	
	}
	
	/**
	 * playGame() starts the pirate and crew member game.
	 * It will take randomly picked crew member's cell number entered 
	 * by warden (which is assigned by the pirate).It will go on until
	 * all the crew members have visited the switch room atleast once
	 * and crew members have confirmed that to the warden.
	 * 
	 */
	static void playGame() {
	
		/* Crew Member Info Object*/
		CrewMemberInfo crewMemInfo = new CrewMemberInfo();
		/* Switch State Info Object*/
		SwitchInfo switchInfo = new SwitchInfo();
		int crewMemTkCnt = 0;
	    final boolean LEFT_SWITCH_STATE_DOWN = false;
	    final boolean LEFT_SWITCH_STATE_UP = true;
		final boolean TALLY_KEEPER = true;
	    
	    try
	    {
	    	while (crewMemTkCnt <= 44)
	 	    {
	 	    	System.out.println("Select a Crew Member to go to switch room:" );
	 	    
	 	        Scanner scanIn = new Scanner(System.in);
	 	    	int random  = Integer.parseInt(scanIn.nextLine());
	 	  
	 	    	if (random > 0 && random < 24)
	 	    	{
	 	    		crewMemInfo.setCrewMemNum(random);
	 	    		
	 	    		if (crewMemInfo.isCrewMemTK() == TALLY_KEEPER && 
	 	    				switchInfo.isLeftSwitchState() == LEFT_SWITCH_STATE_UP)
	 	    		{
	 	    			switchInfo.setLeftSwitchState(LEFT_SWITCH_STATE_DOWN);
	 	    			System.out.println("Crew member has changed the position of the switch in the switch room.");
	 	    			crewMemTkCnt++;
	 	    		}
	 	    		else
	 	    		{
	 	    			if ((crewMemInfo.getCrewMemCount()[random-1] == 0  || 
	 	    					crewMemInfo.getCrewMemCount()[random-1] == 1) && 
	 	    					switchInfo.isLeftSwitchState() == LEFT_SWITCH_STATE_DOWN)
	 	    			{
	 	    				switchInfo.setLeftSwitchState(LEFT_SWITCH_STATE_UP);
	 	    				System.out.println("Crew member has changed the position of the switch in the switch room.");
	 	    				crewMemInfo.setCrewMemCount(random-1);
	 	    				crewMemTkCnt++;
	 	    			}
	 	    			else
	 	    			{	
	 	    				System.out.println("Crew member has changed the position of the switch in the switch room.");
	 		    			crewMemInfo.setCrewMemCount(random-1);
	 	    			}
	 	    		}
	 	    		
	 	    	} 
	 	    	else
	 	    	{
	 	    		System.out.println("Crew member cell number should be between 1 - 23.");
	 	    	}
	 	    	
	 	    	if (crewMemTkCnt == 44)
	 	    	{
		 	    	System.out.println("Hello Warden, every crew member has visited the switch room.");
			 	   	System.out.println("Game Ends");
			    	System.out.println("Crew Members have won the game");
			    	System.out.println("All the crew members will be released.");
	 	    	}
	 	    }
	    }catch(NumberFormatException ne){
	    	System.out.println("Enter crew member from cell number.Restart the game");
	    } 
	}

}
