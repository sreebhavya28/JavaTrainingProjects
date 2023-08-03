package com.lumen.interface2;

public class Main {
	public static void main(String[]args) {
		Basic calc=new Basic();
		calc.add(12, 20);
		calc.difference(19, 24);
		calc.product(23, 13);
		calc.divide(19, 30);
		
		SciCalculatorImpl scientific =new SciCalculatorImpl();
		scientific.square(35);
		scientific.cube(35);
		
	}

}
