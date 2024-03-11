package com.cjc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.CustomerDetails;

@Repository
public interface Custrepository extends JpaRepository<CustomerDetails, Integer> {
	public CustomerDetails deleteById(int nn);

}
