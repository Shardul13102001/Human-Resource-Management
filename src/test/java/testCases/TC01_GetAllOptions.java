package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC01_GetAllOptions extends BaseClass {
	
	@Test
	public void getOptions()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsernam("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
		HomePage hp = new HomePage(driver);
		hp.ClickAdmin();
		hp.getAllOptions();
		
		System.out.println("----------------------------------------------------------------");
	}

}
