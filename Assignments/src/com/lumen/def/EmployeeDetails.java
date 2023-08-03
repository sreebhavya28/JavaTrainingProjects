package com.lumen.def;

public class EmployeeDetails implements BonusCalculator,AllowanceCalculator{
	  
	@Override
	public void calculate(int amount) {
		System.out.println("Bonus: "+(amount*10));
		
	}
	

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		BonusCalculator.super.greet();
		System.out.println("welcome");
	}

	


	@Override
	public void policyType() {
		// TODO Auto-generated method stub
		AllowanceCalculator.super.policyType();
		BonusCalculator.super.PolicyType();
	}


	
}
