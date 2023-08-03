package com.lumen.fun;

public class FunMain {
	public static void main(String[] args) {
		ShapeFacotory shapefacotory=new ShapeFacotory();
	
		
//		 shapefacotory.PrintArea((x,y)->{
//			 System.out.println("cal area of triangle"+(0.5*x*y));
//		 },90,89);
//		
//	}
		

		shapefacotory.PrintArea((x,y)->{
			 System.out.println("cal area of triangle"+(0.5*x*y));	
		}, 90, 10);
		
		shapefacotory.PrintArea((x,y)->{
			 System.out.println("cal area of triangle"+(x*y));	
		}, 20, 10);
		

}
}