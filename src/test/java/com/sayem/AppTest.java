package com.sayem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest{

	@Test 
	public void testRegister(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
}