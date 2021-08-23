package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	//page locators
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By singInButton = By.id("SubmitLogin");
	//private By forgotPwdLink = By.linkText("Forgot your password?");
	private By header = By.xpath("//h1[contains(text(),'Authentication')]");
	
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}
	
	public WebElement getSingInButton() {
		return getElement(singInButton);
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageheader() {
		return getPageHeader(header);
	}
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
    public HomePage doLogin(String username,String pwd) {
	 getEmailId().sendKeys(username);
	 getPassword().sendKeys(pwd);
	 getSingInButton().click();
	 return getInstance(HomePage.class);
	 
	 
 }

    public void doLogin() {
	 getEmailId().sendKeys(" ");
	 getPassword().sendKeys(" ");
	 getSingInButton().click();
	
    }
	
}
