package com.info.facade;

public class NormalCycle implements CycleStore {

	public String orderCycle;
	
	@Override
	public void orderCycle(String brand) {
		// TODO Auto-generated method stub
		orderCycle ="Ordered the normal cycle in the brand of "+ brand;
	}

	@Override
	public String deliverCycle() {
		// TODO Auto-generated method stub
		return "Deliver the "+orderCycle;
	}

}
