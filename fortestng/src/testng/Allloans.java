package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allloans {
	
	@BeforeTest
	public void bft()
	{
		System.out.println("start the test1");
	}
	@AfterTest
	public void aft()
	{
		System.out.println("end the test1");
	}
	@Test(groups = {"system","regression"})
	public void carloan()
	{
		System.out.println("to buy a car");
	}
	@Test(groups = {"smoke","regression"})
	public void bikeloan()
	{
		System.out.println("to buy a bike");
	}
	@Test(groups = {"smoke","regression"})
	public void homeloan()
	{
		System.out.println("to buy a home");
	}
	@Test(groups = {"smoke","regression"})
	public void personalloan()
	{
		System.out.println("to get personal loan");
	}

}
