package com.DDF.businessscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.DDF.base.BaseTest;
import com.DDF.utilities.Screenshot;

public class Login extends BaseTest{

	@Test
	public void loginTest() throws IOException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Screenshot.takeScreenshot();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Screenshot.takeScreenshot();
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Screenshot.takeScreenshot();
		
		driver.findElement(By.id("btnLogin")).click();
		Screenshot.takeScreenshot();
	}
	
	
	
	
}
