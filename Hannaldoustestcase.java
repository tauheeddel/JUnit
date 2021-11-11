package edu.augustana.csc285.labs;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Hannaldoustestcase {

	@Test
	public void testhelpspecialcases() {
		assertEquals("n", Hannaldous.PasswordChecker("bigmoose$"));
		assertEquals("n", Hannaldous.PasswordChecker("CSCHELP@"));
	}
	@Test
	public void testhelpnumbers() {
		assertEquals("n", Hannaldous.PasswordChecker("emusare1001"));
		assertEquals("n", Hannaldous.PasswordChecker("1322131312"));
	}
	@Test
	public void testhelpwords() {
		assertEquals("y", Hannaldous.PasswordChecker("emusareawesome"));
		assertEquals("y", Hannaldous.PasswordChecker("verycool"));
	}
	@Test	
	public void BadPasswordstest() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals(4, Hannaldous.BadPasswords(8, passwords));
	}
	@Test
	public void BadPasswordsallbad() {
		String[] passwords = new String[] { "b$", "e110002", "123go", "o#&y", "@1", "123" };
		assertEquals(0, Hannaldous.BadPasswords(2, passwords));
	}
	@Test
	public void BadPasswordsallgood() {
		String[] passwords = new String[] { "bad", "ella", "gooood", "okay", "Hello", "oops" };
		assertEquals(6, Hannaldous.BadPasswords(3, passwords));
	}
	
	

}
