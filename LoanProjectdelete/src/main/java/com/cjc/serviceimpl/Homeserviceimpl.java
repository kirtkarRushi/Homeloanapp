package com.cjc.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Repository.Custrepository;
import com.cjc.Repository.HomeRepository;
import com.cjc.model.CustomerDetails;
import com.cjc.model.Employee;
import com.cjc.service.Homeservice;

@Service
public class Homeserviceimpl  implements Homeservice{
@Autowired HomeRepository hr;
@Autowired Custrepository hc;
	@Override
	public Employee delete(int n) {
		
		return hr.deleteById(n);
	}
	@Override
	public CustomerDetails deletecust(int nn) {
		
		return hc.deleteById(nn);
	}

}
