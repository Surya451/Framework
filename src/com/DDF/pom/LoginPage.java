package com.DDF.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DDF.businessscripts.Login;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	
	@FindBy(id = "txtUsername")
	WebElement userName;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement logIn;
	
	
}
