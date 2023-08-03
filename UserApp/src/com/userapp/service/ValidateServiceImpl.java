package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidateServiceImpl implements IValidationServiece {
	
	
	String[] usernames = new String []{"sree","sreya","bhavi"};

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		for(String name: usernames){
			if(name.equals(username)) {
				throw new NameExistsException("Name Already Exists");
			
		}
		}
		return true;
	}

	@Override
	public boolean validatePassword(String username) throws TooLongException, TooShortException {
		// TODO Auto-generated method stub
		if (username.length()<4) {
			throw new TooLongException("Password too short");
		}
		if (username.length()>10) {
			throw new TooLongException("Password too long");
		}
		return true;
	}

}
