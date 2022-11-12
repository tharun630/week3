package com.cycle.client;

import com.cycle.cmd.GearCycleBell;
import com.cycle.cmd.GearCycleOffCommand;
import com.cycle.cmd.GearCycleOnCommand;
import com.cycle.cmd.RemoteControl;
import com.cycle.cmd.RoadCycleBell;
import com.cycle.cmd.RoadCycleOffCommand;
import com.cycle.cmd.RoadCycleOnCommand;
import com.info.facade.CycleFacadeDeliverCycle;
import com.info.facade.CycleType;

public class OrderCycle {
	
	
	public static void main(String[] args) {
		
		System.out.println("Facade Pattern");
	   //Facade Pattern 
		System.out.println(CycleFacadeDeliverCycle.deliverCycle(CycleType.ELECTRIC));
		System.out.println(CycleFacadeDeliverCycle.deliverCycle(CycleType.GEAR));
		System.out.println(CycleFacadeDeliverCycle.deliverCycle(CycleType.NORMAL));
	
		
		
		System.out.println();
		//Command pattern 
		System.out.println("********Command Pattern to mute and UnMute the Bells***********");
		RemoteControl control = new RemoteControl();
		RoadCycleBell roadCycleBell = new RoadCycleBell();
	    GearCycleBell gearCycleBell = new GearCycleBell();
	    
	    control.setCommand(new RoadCycleOnCommand(roadCycleBell));
	    control.pressButton();
	    
	    control.setCommand(new RoadCycleOffCommand(roadCycleBell));
	    control.pressButton();
	    
	    control.setCommand(new GearCycleOnCommand(gearCycleBell));
	    control.pressButton();
	    
	    control.setCommand(new GearCycleOffCommand(gearCycleBell));
	    control.pressButton();

		
	}

}
