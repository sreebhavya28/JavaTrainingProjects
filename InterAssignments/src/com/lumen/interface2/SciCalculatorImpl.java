package com.lumen.interface2;

public class SciCalculatorImpl  implements BasicCalculator, ScientificCalculator{

	@Override
	public void square(int x) {
		System.out.println(x*x);
		
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println(x*x*x);
		
	}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
