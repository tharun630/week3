package com.info.facade;

public class CycleFacadeDeliverCycle {

	public static String deliverCycle(CycleType cycleType) {
		if (cycleType != null) {
			switch (cycleType) {
			case GEAR:
				CycleStore gearCycle = new GearCycle();
				gearCycle.orderCycle("Hero");
				return gearCycle.deliverCycle();

			case NORMAL:
				CycleStore normalCyle = new ElectricCycle();
				normalCyle.orderCycle("Giant Bicycle");
				return normalCyle.deliverCycle();

			case ELECTRIC:
				CycleStore electricCycle = new ElectricCycle();
				electricCycle.orderCycle("Trek Bikes");
				return electricCycle.deliverCycle();

			}
		}

		return null;

	}

}
