package com.anweb.finanace.loan.utility;

public class UniqueCustomerNumberGenerator {
	
	public static String getUniqueCustomerNumber(String pancard,String moNumber) {
		
		String subNumber = moNumber.substring(6);
		String uniqueNumber = pancard.concat(subNumber);
		return uniqueNumber;
	}

}
