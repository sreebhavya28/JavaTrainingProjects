package com.lumen.inter1;




public class MainCal {
	
		public static void main(String[] args) {
			calculator addition=(x,y)-> System.out.println(x+y);
			calculator subtraction=(x,y)-> System.out.println(x-y);
			calculator multiplication=(x,y)-> System.out.println(x*y);
			calculator divide=(x,y)-> System.out.println(x/y);
			
				
			
			addition.calaculate(10,20);
			subtraction.calaculate(10,20);
			multiplication.calaculate(10,20);
			divide.calaculate(10,20 );
//			
//			Printer printer =() ->{
//				return "great day";
//			};
//			System.out.println(printer.print());
//			
//			printer=()-> "welcome back";
//			System.out.println(printer.print());
		}
	}


