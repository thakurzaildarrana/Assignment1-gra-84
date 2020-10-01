package com.csis3275.model_gra_84;

public class PartyCalculation extends Party_gra_84 implements PlateType1 {
	public String TotalCount;
	public String typePlate;
	public int price;
	public int totalCount;
	
	
	
	public int mTotalCount(String typePlate,int noOfplates) {
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
	
		//totalCount = 100*noOfplates;
		return totalCount = 100*noOfplates;
	}

	public void defaultNoOfplates(int noOfplates,int personNumber) {
		if(personNumber == noOfplates ||personNumber <= noOfplates) 
		{
			noOfplates = noOfplates;
		}
		else 
		{
				 noOfplates = personNumber;
			 }
	}

}
