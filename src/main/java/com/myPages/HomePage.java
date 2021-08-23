package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

	
	//page locators:
	private By header = By.xpath("//h1[contains(text(),'My account')]");
	private By dressesTab = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	private By casualDressesTab = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]");

	
	public WebElement getHeader() {
		return getElement(header);
	}

    public String getHomePageHeader() {
	 return getPageHeader(header);
    }
    
    public String getHomePageTitle() {
    	return getPageTitle();
    }
    
    public WebElement getDressesTab() {
    	return getElement(dressesTab);
    }
    
    public WebElement getCasualDressesTab() {
    	waitForElementPresent(casualDressesTab);
    	return getElement(casualDressesTab);
    }
    public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
   public CasualDresses doClickDressesTab() {
    	Actions action = new Actions(driver);
    	action.moveToElement(getDressesTab()).moveToElement(getCasualDressesTab()).click().build().perform();
    	return  getInstance(CasualDresses.class);
    }
    
}
