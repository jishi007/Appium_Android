package screen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationsPriorityOrder {
	public int i = 0;

	@BeforeGroups
	public void beforeGroups() {
		i++;
		System.out.println(i + "::BeforeGroups");
	}

	@AfterGroups
	public void afterGroups() {
		i++;
		System.out.println(i + "::AfterGroups");
	}

	@BeforeClass
	public void beforeClass() {
		i++;
		System.out.println(i + "::BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		i++;
		System.out.println(i + "::AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		i++;
		System.out.println(i + "::BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		i++;
		System.out.println(i + "::AfterMethod");
	}

	@BeforeSuite
	public void beforeSuite() {
		i++;
		System.out.println(i + "::BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		i++;
		System.out.println(i + "::AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		i++;
		System.out.println(i + "::BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		i++;
		System.out.println(i + "::AfterTest");
	}

	@Test(priority = 1)
	public void TestMethod1() {
		i++;
		System.out.println(i + "::Test1");
	}

	@Test(priority = 2)
	public void TestMethod2() {
		i++;
		System.out.println(i + "::Test2");
	}
}
