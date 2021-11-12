package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class noSpecialCharactersTest {

	@Test
	void test() {
		Hannaldous test = new Hannaldous();
		String[] passwordList = new String[] {"isThisAGoodPassword?", "Jack&JillOnTheHill", "123password", "YoungNa$ty", "nateisgr8", "nateisgr&", "Pa$$word&", "this^password", "yetanotherPassword"};
		boolean[] isValid = { false, false, true, false, true, false, false, false, true};
		
		//indexes through the password array
		for (int i = 0; i < passwordList.length; i++) {
			
			//checks to see if the password is the minimum required length and has no special characters.
			//if true, the number of good passwords is incremented by 1.
			boolean output = test.noSpecialCharacters(passwordList[i]);
			assertEquals(output, isValid[i]);
		}

	}
}
