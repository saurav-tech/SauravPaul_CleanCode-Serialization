package com.construction;

public class ConstructionCost {
	public double costOf(String materialStandard, double areaOfHouse, boolean automatedHome) {
		double totalAmount = 0;
		switch(materialStandard) {
		case "SM" : totalAmount = (double) 1200 * areaOfHouse;
					break;
		case "ASM":	totalAmount = (double) 1500 * areaOfHouse;
					break;
		case "HSM": if(automatedHome) {
						totalAmount = (double) 1800 * areaOfHouse;
					}
					else {
						totalAmount = (double) 2500 * areaOfHouse;
					}
					break;
		}
		return totalAmount;
	}
}
