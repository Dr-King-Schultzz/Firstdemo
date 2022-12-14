package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ActionUtils extends BaseClass{


	public void typeIn(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	public void moveAndClickElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();;
	}
	
	
	public WebElement getElement(String locType, String locValue) {
		
		if(locType.equals("xpath"))
			return driver.findElement(By.xpath(locValue));
		if(locType.equals("id"))
			return driver.findElement(By.id(locValue));
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
