package com.lumen.def;

import com.lumen.fun.Greeter;

public class AnomyDemo {
	
	public static void main(String[] args) {
		Greeter greeter = new GreeterImpl();
		greeter.greetUser("sree");
		
		
		//anonymous class - implementation
		
		Greeter greetOne=new Greeter() {

			@Override
			public void greetUser(String username) {
				// TODO Auto-generated method stub
				System.out.println("great day "+username);
				
			}
		};
			
			greetOne.greetUser("sri");
			Greeter greetTwo=new Greeter() {
				@Override
				public void greetUser(String username) {
					// TODO Auto-generated method stub
					System.out.println("welcome"+username);
				
				
			}
			
			
		};
		greetTwo.greetUser("Honey");
	}

}
