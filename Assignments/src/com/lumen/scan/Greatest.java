package com.lumen.scan;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number:-");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number:-");
		int n2 = scan.nextInt();
		
		System.out.println("Enter third number:-");
		int n3 = scan.nextInt();
		
		scan.close();

    int greatNumber = n1>n2 ? (n1>n3 ? n1:n3) : (n2>n3 ? n2: n3);
		
		System.out.println("Greatest of 3 numbers is: "+ greatNumber);

	}

}


