package com.info.facade;

public class GearCycle implements CycleStore{

	public String orderCycle;
 
	@Override
	public void orderCycle(String brand) {
		// TODO Auto-generated method stub
		orderCycle = "Ordered Gear cycle in the brand of "+brand;
	}

	@Override
	public String deliverCycle() {
		// TODO Auto-generated method stub
		return "Deliver the "+orderCycle;
	}

}
