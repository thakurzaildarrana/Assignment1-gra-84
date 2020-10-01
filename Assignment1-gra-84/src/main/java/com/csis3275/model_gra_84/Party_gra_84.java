package com.csis3275.model_gra_84;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Party_gra_84 extends Parent_gra_84 implements PlateGarden {
	public int personNumber = 0;
	public int noOfplates = 0;
	public int totalCount =0;
	public String typePlate;
	public int price = 0;
	public int priceB = 0;

	public Date functiondate;
	
	public String partyType;
	public double totalCost;
	public int noOfPerson;
	public int perPlate;
	
	public Party_gra_84() {
		
		//default constructor 

		}
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date getFunctiondate() {
		return functiondate;
	}
	public void setFunctiondate(Date functiondate) {
		this.functiondate = functiondate;
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
	
	
			this.noOfplates = noOfplates;
		
	}

	public String getTypePlate() {
		
		return typePlate;
	}



	public void setTypePlate(String typePlate) {
		
		this.typePlate = typePlate;
	}
	
	public int getNoOfplates() {
		if(this.personNumber <= this.noOfplates) 
		{
			return noOfplates;
		}
		else 
		{
				 this.noOfplates = this.personNumber;
				 return noOfplates;
			 }
		
	}
	public void count() {
		
	}	
	public int getTotalCount() 
	{
		if (typePlate.matches(BG)) {
			price = BP;
		} else if (typePlate.matches(MG)) {
			price = MP;
		} else if (typePlate.matches(SG)) {
			price = SP;
		} else if (typePlate.matches(SHG)) {
			price = SHP;
		}
		return totalCount = price*noOfplates +placeTotalCount();
	}
	public int placeTotalCount() {
		if (partyType.matches(BIG)) {
			priceB = BPP;
		} else if (partyType.matches(MIG)) {
			priceB = MPP;
		} else if (partyType.matches(SIG)) {
			priceB = SPP;
		} else if (partyType.matches(SHIG)) {
			priceB = SHPP;
		} else if (partyType.matches(MMG)) {
			priceB = MPPP;
		} else if (partyType.matches(SSG)) {
			priceB = SPPP;
		} else if (partyType.matches(SHHG)) {
			priceB = SHPPP;
		}
		return priceB;
	}




}
