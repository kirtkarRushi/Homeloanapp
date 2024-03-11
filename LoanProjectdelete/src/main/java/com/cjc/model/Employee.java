package com.cjc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int employeeId;
		private int employeeName;
		private String employeeEmail;
		private long employeeContactNo;
		private String employeedesignation;
		private byte[] employeeProfileImage;
	
	
}
