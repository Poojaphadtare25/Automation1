package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnntnProgrm {
	@BeforeMethod
	public void one()
	{
		System.out.println("Before method");
	}
	@Test
	public void two()
	{
		System.out.println("Test");
	}
	@BeforeTest
	public void three()
	{
		System.out.println("Before test");
	}
	@AfterMethod
	public void four()
	{
		System.out.println("After method");
	}
	@AfterClass
	public void five()
	{
		System.out.println("After class");
	}
	@BeforeClass
	public void six()
	{
		System.out.println("Before class");
	}
	@BeforeSuite
	public void seven()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void eight()
	{
		System.out.println("Aftr suite");
	}
}
