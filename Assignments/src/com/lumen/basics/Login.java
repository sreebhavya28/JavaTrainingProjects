package com.lumen.basics;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		 String usernames[]={"sree","sreya","bhavi","bujji","honey"};
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("enter user name");
		 String typer=scanner.nextLine();
		 int count=0;
		 for ( String inline:usernames) {
			 if(inline.equals(typer)) {
				 System.out.println("you login sucessfully");
				 count=1;
				 break;
			 }
		 }
		 if(count==0) {
			 System.out.println(" invalid username");
		
		
		 }
		 scanner.close();

	} 
	

}
