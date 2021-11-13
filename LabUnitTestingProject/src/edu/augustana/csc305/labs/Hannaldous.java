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
	 * @param requiredLength - the minimum required length for each password to qualify as good
	 * @param passwords - an array of passwords
	 * @return the number of "bad" passwords
	 */
	public static int countBadPasswords(int requiredLength, String[] passwords) {
		int numBadPassword = 0;
		
		for (int i = 0; i < passwords.length; i = i + 1) {
			if (passwords[i].length() < requiredLength || isBad(passwords[i]))
				numBadPassword++;
		}
		return numBadPassword;
	}

	/**
	 * @param password - the password to examine
	 * @return true if it's "bad" and false otherwise
	 */
	static Boolean isBad(String password) {
		for (int index = 0; index < password.length(); index++) {
			char token /* Each password's token */ = password.charAt(index);
			if (!(token >= 'a' && token <= 'z' || token >= 'A' && token <= 'Z'))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isBad("bigmoose$"));
		System.out.println(isBad("emusareawesome"));
		System.out.println(isBad("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(countBadPasswords(8, passwords));
	}

}
