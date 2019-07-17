package com.masoud.demo;

public class EmployeeNotFoundException extends RuntimeException {
	
	EmployeeNotFoundException(Long id){
		super("Could not find employee" + id);
	}

}
