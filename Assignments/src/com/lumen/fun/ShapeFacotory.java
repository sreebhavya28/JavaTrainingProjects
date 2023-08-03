package com.lumen.fun;

public class ShapeFacotory {
	void PrintArea( Shape shape ,double x,double y) {
		System.out.println("printing area");
		shape.CalcArea(x, y);
		System.out.println("done");
	}

}
