package com.myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myPages.CasualDresses;
import com.myPages.HomePage;

public class HomePageTest extends BaseTest {

	@Test(priority=1,enabled=false)
	public void verifyHomePageTitle() {
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My account - My Store");
	}
	
	
	@Test(priority=2,enabled=false)
	public void verifyHomePageheader() {
		String header=page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "MY ACCOUNT");
	}
	@Test(priority=3)
	public void verifyDressesTab() {
	CasualDresses casualDresses=page.getInstance(HomePage.class).doClickDressesTab();
	String header=casualDresses.getCasualDressesHeader();
	System.out.println(header);
	Assert.assertEquals("CASUAL DRESSES", "CASUAL DRESSES");
	}
}
