package com.W3.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.W3.qa.pages.HomePage;
import com.W3.qa.pages.LoginPage;
import com.W3.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homePage;
	public LoginPageTest()
	{
		super();
		
	}
	
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		
	}
	
	
	
	@Test(priority = 1)
	public void titleTest()
	{
		
		String title = loginpage.validateLoginPageTitle();
		System.out.println(title);
		
		AssertJUnit.assertEquals(title, "Log in - W3Schools");
		
	}
	/*@Test(priority = 3)
	public void validatelogo()
	{
		boolean flag = loginpage.logotest();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	*/
	@Test(priority = 2)
	public void loginTest()
	{
		
	homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
}
