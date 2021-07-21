package com.W3.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.W3.qa.testbase.TestBase;

public class MyLearning extends TestBase {
	
	HomePage homepage;
	MyLearning mylearning;
	@FindBy(id = "javatext")
	WebElement java;
	
@FindBy(id = "alltutorials")

WebElement javalist;


public MyLearning() {
		
		PageFactory.initElements(driver, this);
		
	}

public void clickonjava() {
	
	//homepage.clickOnMyLearning().java.click();
	
	 java.click();
	
	
}
public void clickonjavaintro()
{
	
	
	//Actions action = new Actions(driver);
	//action.moveToElement(javalist).build().perform();
	driver.findElement(By.id("subject_link_2")).click();
	
	
	
}



	
}
