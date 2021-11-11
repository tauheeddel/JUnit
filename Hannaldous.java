package edu.augustana.csc285.labs;

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
	
	//this counts and tell how many bad passwords are in the array with in the 
	//certain character index
	public static int BadPasswords(int greatercharacters, String[] passwords) {
		int letterIndex = passwords.length - 1;
		int count = 0;
		for (int i = 0; i < passwords.length; i = i + 1) {
		if (passwords[letterIndex].length() < greatercharacters || PasswordChecker(passwords[letterIndex]).equals("y"))
			letterIndex--;
			count++;
	}
		return count;
						}
	//This Help method tells if this password is all characters and if its
	//not all characters then it returns no because it either has a special case in 
	// the password
	static String PasswordChecker(String password) 
	{		
		int index = -1;
		
		while (index++ < password.length() - 1) {
			char letter = password.charAt(index); 
			
			if (! (letter >= 'a' && letter <='z'|| letter >='A' && letter <= 'Z')) 
		return "n"; 
			}
		
		return "y";
	}
	
	
	public static void main(String[] args) {
		
	}

}
