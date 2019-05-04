/**
 * @author : Sayaka Tamura
 * May 3, 2019
 * Udemy Learn Java Unit Testing with JUnit 4
 * https://github.com/in28minutes/JUnitIn28Minutes
 */
package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}

	// Check truncateAInFirst2Positions() works as expected
	// Result:AACD->CD, ACD->CD, CDEF->CDEF, CDAA->CDAA
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		// goes to actual param with Refactor -> inline
		// String actual = helper.truncateAInFirst2Positions("AACD");

		// goes to expected param with Refactor -> inline
		// String expected = "CD";

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// expected, actual
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	// Check areFirstAndLastTwoCharactersTheSame() works as expected
	// Result:ABCD=>false, ABAB=>true, AB=true, A=>false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		// assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		// the same as above
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));

		// in the case tried to make a mistake on purpose -> failed
		// assertFalse(true);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
