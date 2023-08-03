package com.lumen.objbasics;

public class StudentMain {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student student = new Student("pandu", "cse");
			
			student.printDetails();
			
			student.getGrades(91,56,71);
			
			//second object
			Student student1 = new Student("amar", "eee");
			
			student1.printDetails();
			
			student1.getGrades(81,91,87);
			

		}

	}




