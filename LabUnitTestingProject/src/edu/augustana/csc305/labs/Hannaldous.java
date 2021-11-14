package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {
	
	/***
	 * @param requiredLength - minimum required length for a good password 
	 * @param passwords - list of passwords to be checked
	 * @return the number of bad passwords
	 */
	public static int countBadPasswords(int requiredLength, String[] passwords) {
		int count = 0;
		
		for (int i = 0; i < passwords.length; i++) 
		{
			if (passwords[i].length() < requiredLength || isBad(passwords[i]))
				count++;
		}
		return count;
	}
	
	/***
	 * @param password - the password to be checked
	 * @return true if it's bad, and false otherwise
	 */
	
	static boolean isBad(String password) 
	{		
		
		for (int i = 0; i < password.length(); i++) {
			char letter  = password.charAt(i); 
			
			if (!(letter >= 'a' && letter <='z'|| letter >='A' && letter <= 'Z')) 
				return false; 
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		/*
		System.out.println(isBad("bigmoose$"));
		System.out.println(isBad("emusareawesome"));
		System.out.println(isBad("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(countBadPasswords(8,passwords));
		
		System.out.println();
		System.out.println(isBad("bigmoose"));
		System.out.println(isBad("123goodbye"));
		System.out.println(countBadPasswords(17,new String[] {"hoangnhitrangia", "hoangnhitrangia19"}));
		System.out.println(countBadPasswords(8, new String[] { "*********", "hoangnhitr4ngi4" }));
		System.out.println(countBadPasswords(8, new String[] { "bigmoose", "emusareawesome", "123"})); */
		
		System.out.println(countBadPasswords(8, new String[] { "*********", "hoangnhitr4ngi4" }));
	}

}
