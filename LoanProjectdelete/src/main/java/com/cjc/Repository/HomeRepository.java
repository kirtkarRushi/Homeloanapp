package com.cjc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

@Repository
public interface HomeRepository  extends JpaRepository<Employee, Integer>{
public Employee deleteById( int n);
}
