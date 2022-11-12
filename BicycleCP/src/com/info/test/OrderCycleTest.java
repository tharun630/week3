package com.info.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.info.facade.CycleFacadeDeliverCycle;
import com.info.facade.CycleType;

public class OrderCycleTest {
	
	CycleFacadeDeliverCycle cycle;
	
	@Test
	public void testGearDeliverCyle() {
		assertNotNull(CycleFacadeDeliverCycle.deliverCycle(CycleType.GEAR));
	}
	
	@Test
	public void testNormalDeliverCyle() {
		assertNotNull(CycleFacadeDeliverCycle.deliverCycle(CycleType.NORMAL));
	}
	
	@Test
	public void testElectricDeliverCyle() {
		assertNotNull(CycleFacadeDeliverCycle.deliverCycle(CycleType.ELECTRIC));
	}
	
	@Test
	public void testNullCycleType() {
		assertNull(CycleFacadeDeliverCycle.deliverCycle(null));
	}

}
