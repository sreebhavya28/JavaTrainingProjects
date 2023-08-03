package com.lumen.def;

public class AnonDemo {

	public static void main(String[] args) {

    BonusCalculator bonus=new EmployeeDetails();
    BonusCalculator  bc=new  BonusCalculator () {

		@Override
		public void calculate(int amount) {
			System.out.println(amount*10
					);
			
		}
    	
    	
    };
    bc.calculate(100);
    

	}

}
