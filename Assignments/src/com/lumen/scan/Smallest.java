package com.lumen.scan;
import java.util.Scanner;

public class Smallest {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number:-");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number:-");
		int n2 = scan.nextInt();
		
		System.out.println("Enter third number:-");
		int n3 = scan.nextInt();
		
		scan.close();

    int Smallest= n1<n2 ? (n1<n3 ? n1:n3) : (n2<n3 ? n2: n3);
		
		System.out.println("Smallest of 3 numbers is: "+ Smallest);

	}

}

	



