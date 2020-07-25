package com.interest;



public class Interest {
 
	public double simpleInterestOf(int principalAmount, float interestRate, int time) {
		double simpleInterest = (double)(principalAmount * interestRate * time)/100;
		return simpleInterest;
	
	}
	
	public double compoundInterestOf(int principalAmount, float interestRate, int time, int n) {
		double amount = principalAmount * Math.pow(1 + (interestRate / n), n * time); 
		return amount;
	}
}
