package com.DDF.businessscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.DDF.base.BaseTest;

public class Login extends BaseTest{

	@Test
	public void loginTest() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();

	}
	
	
	
	
}
