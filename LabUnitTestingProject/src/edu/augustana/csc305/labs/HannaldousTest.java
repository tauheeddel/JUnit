package edu.augustana.csc305.labs;


import static org.junit.Assert.*;

import org.junit.Test;

public class HannaldousTest {

	@Test
	public void testCountBadPasswords() {
		assertEquals(4, Hannaldous.countBadPasswords(8, new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" }));
		assertEquals(6, Hannaldous.countBadPasswords(8, new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat", "$$$$", "aaaaaa8" }));
		assertEquals(6, Hannaldous.countBadPasswords(100, new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" }));
		
	}
	
	@Test
	public void testIsBad() {
		assertEquals(false, Hannaldous.isBad("%"));
		assertEquals(true, Hannaldous.isBad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		assertEquals(false, Hannaldous.isBad("aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaa"));
	}

}
