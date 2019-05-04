/**
 * @author : Sayaka Tamura
 * May 4, 2019
 * Udemy Learn Java Unit Testing with JUnit 4 Section
 * https://github.com/in28minutes/JUnitIn28Minutes
 */
package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	// Arrays.sort

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class) // JUnit5: Check assertThrows
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

}
