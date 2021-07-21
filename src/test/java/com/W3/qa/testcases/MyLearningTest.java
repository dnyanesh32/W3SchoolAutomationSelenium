package com.W3.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.W3.qa.pages.Billing;
import com.W3.qa.pages.HomePage;
import com.W3.qa.pages.LoginPage;
import com.W3.qa.pages.MyLearning;
import com.W3.qa.pages.PaidCourse;
import com.W3.qa.pages.SettingPage;
import com.W3.qa.testbase.TestBase;

public class MyLearningTest extends TestBase {
	
	

	LoginPage loginpage;
	HomePage homepage;
	
	MyLearning mylearning;
	
	
	//TestUtil testutil;
	
	public MyLearningTest()
	{
		super();
		
	}
	
	//Test Cases should be seprated there should not be dependancy.
	@BeforeMethod()
	public void setUp() {
		initialization();
		//testutil = new TestUtil();
		loginpage = new LoginPage();
		homepage = new HomePage();
		mylearning = new MyLearning();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		mylearning = homepage.clickOnMyLearning();
	
	}
	
	
	@Test()
	public void clickonjavaTest()
	{
		mylearning.clickonjava();
	}
	
	@Test()
	public void clickonjavaintroTest()
	{
		mylearning.clickonjava();
		mylearning.clickonjavaintro();
		
	}
				
				
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

	
	
}
