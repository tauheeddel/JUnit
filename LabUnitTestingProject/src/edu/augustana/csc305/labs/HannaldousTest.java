package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HannaldousTest {

	@Test
	public void testCountBadPasswords() {
		assertEquals(3, Hannaldous.countBadPasswords(8, new String[] { "bigmoose", "emusareawesome", "123"}));
		assertEquals(1, Hannaldous.countBadPasswords(8, new String[] { "*****", "**********", "hoangnhitr4ngi4" }));
		assertEquals(1, Hannaldous.countBadPasswords(17, new String[] { "hoangnhitrangi$", "hoangnhitrangia19" }));
	}

	@Test
	public void testIsBad() {
		assertEquals(false, Hannaldous.isBad("****"));
		assertEquals(true, Hannaldous.isBad("hoangnhi"));
		assertEquals(false, Hannaldous.isBad("hoangnhitrangi$"));
	}
}
