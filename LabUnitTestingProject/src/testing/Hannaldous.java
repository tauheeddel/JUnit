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
	
	/**
	 * Determines the number of valid passwords.
	 * 
	 * @param minLength - minimum length of chars that the password must be.
	 * @param passwordList - the password list in the form of an array.
	 * @return - the number of valid passwords
	 * 
	 */
	public static int goodPasswords(int minLength, String[] passwordList) {
		
		int goodPasswords = 0;
		
		//indexes through the password array
		for (int i = 0; i < passwordList.length; i++) {
			
			//checks to see if the password is the minimum required length and has no special characters.
			//if true, the number of good passwords is incremented by 1.
			if (passwordList[i].length() >= minLength && noSpecialCharacters(passwordList[i]) == true) {
				goodPasswords++;
			}
			}	
		return goodPasswords;
						}
	/**
	 * Determines whether or not the password contains a special character.
	 * 
	 * @param password - the password being examined
	 * @return - true or false depending on whether or not the character is a letter/digit.
	 */
	static boolean noSpecialCharacters(String password){		
		
		//runs through each character of password.
		for (int j = 0; j < password.length(); j++) {
			char index = password.charAt(j);
			
			//checks to see if character is a special character and returns false if it is. Otherwise, the loop continues.
			if (!(Character.isDigit(index)||Character.isLetter(index))) {
				return false;
			}
		}
		return true;
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(noSpecialCharacters("bigmoose"));
		System.out.println(noSpecialCharacters("emusareawesome"));
		System.out.println(noSpecialCharacters("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(goodPasswords(8,passwords));
	}

}
