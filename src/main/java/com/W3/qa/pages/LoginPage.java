package com.W3.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.W3.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory and Object repository
	
	@FindBy(name = "email")
	WebElement email;
	
	

	@FindBy(name = "current-password")
	WebElement password;	
	
	/*@FindBy(xpath="/html/body/div[1]/div/div/div[4]/div/div/div[4]/div[1]/button") ////button[contains(test().'Signup')]")
	
	WebElement loginbtn;
	*/
	
	@FindBy (xpath ="//span[contains(text(),'Log in')]")
	WebElement loginbtn;
	
	@FindBy (xpath ="//span[contains(text(),'Sign up')]")
	WebElement Signup;
	
	/*
	@FindBy (xpath ="/html/body/div[1]/div/div/div[2]/div/a/svg")
	WebElement logo;
	*/
	//Initializing the page object
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
		}
	/*
	public boolean logotest()
	{
		return logo.isDisplayed();
	}
	*/
	public HomePage login(String un , String pwd) {
		
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}
	
	
}


