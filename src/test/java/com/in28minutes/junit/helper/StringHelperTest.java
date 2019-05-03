/**
 * @author : Sayaka Tamura
 * May 3, 2019
 * Udemy Learn Java Unit Testing with JUnit 4
 * https://github.com/in28minutes/JUnitIn28Minutes
 */
package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		// Check truncateAInFirst2Positions() works as expected
		// AACD->CD, ACD->CD, CDEF->CDEF, CDAA->CDAA
		StringHelper helper = new StringHelper();

		// goes to actual param with Refactor -> inline
		// String actual = helper.truncateAInFirst2Positions("AACD");

		// goes to expected param with Refactor -> inline
		// String expected = "CD";

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		// expected, actual
	}

}
