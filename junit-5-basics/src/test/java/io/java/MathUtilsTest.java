package io.java;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.lang.annotation.Repeatable;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathutils;

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}
	TestInfo testinfo;
	TestReporter testReport;
	@BeforeEach
	void init(TestInfo testinfo, TestReporter testReport) {
		this.testinfo = testinfo;
		this.testReport = testReport;
		mathutils = new MathUtils();
		testReport.publishEntry("RUnning "+testinfo.getDisplayName());
	}

	@AfterEach
	void cleanup() {
		System.out.println("cleanin up....");
	}
@Nested
@DisplayName("add metho")
@Tag("Math")
class AddTest{
	@Test
	@DisplayName("Testing Add method")
	void testAdd() {
		int expected = 2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected, actual, "the add method");
	}
	
	@Test
	@DisplayName("Testing Add negetive method")
	void testAddNegetive() {
		int expected = 2;
		int actual = mathutils.add(3, -1);
		assertEquals(expected, actual, () -> "the add method " +expected+ " "+actual);
	}
	
}
	@Test
	//@EnabledOnOs(OS.LINUX)
	void testDivide() {
		boolean isServerUp = false;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class, () -> mathutils.divide(0, 0), "divide by zero should throw");
	}

	@Test
	//@RepeatedTest(3)
	@Tag("Circle")
	void testComputeCircleRaduis(RepetitionInfo repeatableInfo) {
		repeatableInfo.getCurrentRepetition();
		assertEquals(314.1592653589793, mathutils.computeCircleArea(10), "the radius method");
	}
	
	@Test
	@Disabled("TDD metho shound not run")
	void testDisabled() {
		fail("this should be disabled");
	}
	
	@Test
	@DisplayName("Multiple Method")
	@Tag("Math")
	void testMultiply() {
		//assertEquals(4,  mathutils.multiply(2, 2), "should retunr multope");
	//System.out.println("RUnning "+testinfo.getDisplayName()+ " woith tag"+ testinfo.getTags());
		testReport.publishEntry("RUnning "+testinfo.getDisplayName());
		
		assertAll( () -> assertEquals(4,  mathutils.multiply(2, 2)),
			() -> assertEquals(0,  mathutils.multiply(2, 0)),
			() -> assertEquals(-2,  mathutils.multiply(2, -1)),
			() -> assertEquals(100,  mathutils.multiply(2, 50))
			);
	}
	

}
