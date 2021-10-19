package com.DDF.base;

import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.openqa.selenium.WebElement;

public class ActionEngine extends BaseTest{

	
	
	public void click(WebElement element) {
		
           element.click();
	}
	
	public void dTA(WebElement element,String testData) {
		
         element.clear();
         element.sendKeys(testData);
	}
	
	
	
	
}




