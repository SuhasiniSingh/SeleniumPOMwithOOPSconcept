package com.myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myPages.HomePage;
import com.myPages.LoginPage;

public class LoginPageTest extends BaseTest {


	@Test(priority=1,enabled=false)
	public void verifyLoginPagetitleTest() {
		String title =page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Login - My Store");
	}
	
	@Test(priority=2,enabled=false)
	public void verifyLoginPageHeaderTest() {
		String header=page.getInstance(LoginPage.class).getLoginPageheader();
		System.out.println(header);
		Assert.assertEquals(header, "AUTHENTICATION");
	}
	
	@Test(priority=3,enabled=false)
	public void verifryLoginTest() {
	HomePage homePage=	page.getInstance(LoginPage.class).doLogin("crochet2usa@gmail.com", "selenium@2021");
	String homePageHeader=homePage.getHomePageHeader();
	System.out.println(homePageHeader);
	Assert.assertEquals(homePageHeader, "MY ACCOUNT");
	}
}
