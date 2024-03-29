package com.cjc.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class CustomerDetails 
{
	@Id
	private int customerApplicationId;
	private String customerFirstName;
	private String customerMiddleName;
	private String customerLastName;
	private long customerMobileNumber;
	private long customerAdditionalMobileNumber;
	private String customerPanCard;
	private long customerAadharCard;
	private String customerDateOfBirth;
	private String customerEmail;
	private String customerGender;
	private String customerQualification;
	private int customerCibilScore;
	private String customerLoanStatus;
	private double customerLoanAmountRequired;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerProfession customerProfession;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerBankDetails customerBankDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAllDocuments customerAllDocuments;

}