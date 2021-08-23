package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasualDresses extends BasePage {
	
	private By header = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/h1[1]/span[1]");   
	
    public String getCasualDressesPageTitle() {
    	return getPageTitle();
    }
    
    public WebElement getheader() {
    	return getElement(header);
    }
    
    public String getCasualDressesHeader() {
    	//waitForElementPresent(header);
    	return getPageHeader(header);
    }

	public CasualDresses(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
