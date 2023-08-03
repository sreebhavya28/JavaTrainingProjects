package com.lumen.extend;

public class SciCalculator extends BasicCalculator implements Scientific {

	@Override
	public void square(int x) {
		
		System.out.println("square "+ (x*x));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("cube "+ (x*x*x));
		
		
	}

}
