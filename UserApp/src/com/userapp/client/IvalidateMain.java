package com.userapp.client;

import com.userapp.service.ValidateServiceImpl;

public class IvalidateMain {
	public static void main(String[] args) {
		ValidateServiceImpl ival = new ValidateServiceImpl(); 
		
		try {
			ival.validateUsername("sree");
			ival.validatePassword("nns");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
