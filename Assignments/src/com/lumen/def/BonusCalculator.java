package com.lumen.def;

public interface  BonusCalculator {
	void calculate (int amount);
	default void greet() {
		System.out.println("have a good day");
	}
	default void PolicyType() {
		System.out.println("welcome to policy");
	}
 
	static void call() {
		System.out.println("calling for lunch");
	}
}
