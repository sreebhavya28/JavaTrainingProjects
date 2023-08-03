package com.lumen.extend;

public class BasicCalculator implements Calculater {

	@Override
	public void add(int x, int y) {
		System.out.println("sum " +(x+y));

	}

	@Override
	public void product(int x, int y) {
		System.out.println("product "+(x*y));



	}

}
