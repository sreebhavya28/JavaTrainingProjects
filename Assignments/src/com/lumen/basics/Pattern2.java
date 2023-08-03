package com.lumen.basics;

public class Pattern2 {
	

		public static void main(String[] args) {
			int num=5;

			int temp=0;

			for ( int i = 1; i <=num; i++) {
				
				for (int j = 1; j <= i; j++) {
					temp++;
					System.out.print(temp);

					
				}
				System.out.print(" ");
			}

		}

	}


