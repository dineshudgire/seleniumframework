package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Add_dependency {
	
	@Test(priority = 1, invocationCount = 4)
	public void signup()
	{
		Reporter.log("signup page", true);
		Assert.fail();
	}
	@Test(priority = 2, invocationCount = 3, dependsOnMethods = "signup")
	public void login()
	{
		Reporter.log("login page", true);
	}
	@Test(priority = 3, invocationCount = 2, dependsOnMethods = {"signup","login"})
	public void OH()
	{
		Reporter.log("orderHistory page", true);
	}
	@Test(priority = 4, dependsOnMethods = {"signup", "login"})
	public void logout()
	{
		Reporter.log("logout page", true);
	}


}
