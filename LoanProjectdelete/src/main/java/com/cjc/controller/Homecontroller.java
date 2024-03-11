package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.model.CustomerDetails;
import com.cjc.model.Employee;
import com.cjc.service.Homeservice;

@RestController
public class Homecontroller {

	@Autowired
	Homeservice hs;

	@DeleteMapping("/deleteemp/{employeeId}")
	public Employee delete(@PathVariable("employeeId") int n) {
		Employee emp = hs.delete(n);
		return emp;
	}

	@DeleteMapping("/deletecust/{customerApplicationId}")
	public CustomerDetails deletecust(@PathVariable("customerApplicationId") int nn)
	{
		CustomerDetails cust=hs.deletecust(nn);
		return cust;
	}
	
	
}
