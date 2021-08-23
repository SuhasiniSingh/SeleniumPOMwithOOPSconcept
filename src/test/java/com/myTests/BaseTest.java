package com.myTests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.config.ConfigReader;
import com.myPages.BasePage;
import com.myPages.LoginPage;
import com.myPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public Page page;
	private ConfigReader configReader;
	Properties prop;
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUpTest() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String browserName = prop.getProperty("browser");
		System.out.println("browser from config property " + browserName);
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("no browser is defined in xml file..");
		}
		
		driver.get(prop.getProperty("url"));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page = new BasePage(driver);
		page.getInstance(LoginPage.class).doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
