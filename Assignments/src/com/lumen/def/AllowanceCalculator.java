package com.lumen.def;

public interface AllowanceCalculator {
	void calcualte(int amount);
	default void policyType() {
		System.out.println("policy for allowance calculation");
	}

}
