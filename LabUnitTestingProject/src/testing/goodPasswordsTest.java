package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class goodPasswordsTest {

	@Test
	void test() {
		Hannaldous test = new Hannaldous();
		int minLength = 6;
		String[] passwordList = {"hi", "isThisAGoodPassword?", "Jack&JillOnTheHill", "123password", "YoungNa$ty", "nateisgr8", "nateisgr&", "5467", "985743298", "Pa$$word&", "this^password", "yetanotherPassword"};
		int numValidPasswords = 4;

		int output = test.goodPasswords(minLength, passwordList);
		assertEquals(output, numValidPasswords);
	}

}
