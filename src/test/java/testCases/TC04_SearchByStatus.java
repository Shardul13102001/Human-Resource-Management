package testCases;

import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC04_SearchByStatus extends BaseClass {
	
	@Test
	public void getOptions() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsernam("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
		HomePage hp = new HomePage(driver);
		hp.ClickAdmin();
		
		AdminPage ap = new AdminPage(driver);
		ap.ClickStatusDropDown();
		ap.ClickEnable();
		ap.captureRecord();
		
		System.out.println("----------------------------------------------------------------");
	}

}
