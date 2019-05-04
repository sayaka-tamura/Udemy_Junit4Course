/**
 * @author : Sayaka Tamura
 * May 4, 2019
 * Udemy Learn Java Unit Testing with JUnit 4 Section
 * https://github.com/in28minutes/JUnitIn28Minutes
 */
package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	@BeforeClass // JUnit5: @BeforeAll, don't have to be static
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before // JUnit5: @BeforeEach
	public void setup() {
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After // JUnit5: @AfterEach
	public void teardown() {
		System.out.println("After Test");
	}

	@AfterClass // JUnit5: @AfterAll, don't have to be static
	public static void AfterClass() {
		System.out.println("After Class");
	}

}
