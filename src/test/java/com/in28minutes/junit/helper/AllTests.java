/**
 * @author : Sayaka Tamura
 * May 4, 2019
 * Udemy Learn Java Unit Testing with JUnit 4 Section
 * https://github.com/in28minutes/JUnitIn28Minutes
 */
package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//"Test Suite" is what to be grouped some tests
// Similar to JUnit5: @Nested?
@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class })
public class AllTests {

}
