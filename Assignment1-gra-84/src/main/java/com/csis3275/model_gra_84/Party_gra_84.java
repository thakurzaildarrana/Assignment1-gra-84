package com.csis3275.model_gra_84;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Party_gra_84 implements PlateType1 {
	public int personNumber = 0;
	public int noOfplates = 0;
	public int totalCount;
	



	public String typePlate;
	public int price = 100;
	public String firstName;
	public String lastName;
	public Date functiondate;
	public String email;
	public String partyType;
	public double totalCost;
	public int noOfPerson;
	public int perPlate;
	
	public Party_gra_84() {
		
		//default constructor 

		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	public String getEmail() {
		return email;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date getFunctiondate() {
		return functiondate;
	}
	public void setFunctiondate(Date functiondate) {
		this.functiondate = functiondate;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getPartyType() {
		return partyType;
	}
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	
	

	public void setNoOfplates(int noOfplates) {
	
		if(this.personNumber <= noOfplates) 
		{
			this.noOfplates = noOfplates;
		}
		else 
		{
				 noOfplates = this.personNumber;
			 }
	}

	public String getTypePlate() {
		
		return typePlate;
	}



	public void setTypePlate(String typePlate) {
		
		this.typePlate = typePlate;
	}
	
	public int getNoOfplates() {
		return noOfplates;
	}
	public void count() {
		
	}	
	public int getTotalCount() {
//		if(typePlate.equalsIgnoreCase(BG)) {
//			price = BP;
//		}
//	else if(typePlate.equalsIgnoreCase(MG)) {
//		price = MP;
//	}
//		else if(typePlate.equalsIgnoreCase(SG)) {
//			price = SP;
//		}
//			else if(typePlate.equalsIgnoreCase(SHG)) {
//				price = SHP;
//			}
//	
//		
		return totalCount = price*noOfplates;
	}
	




}
