package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verifyLogin(String username, String password, String exp) 
	{

		LoginPage lp = new LoginPage(driver);
		lp.setUsernam(username);
		lp.setPassword(password);
		lp.clickLogin();

		if (exp.equalsIgnoreCase("Valid")) 
		{
			try {

				Thread.sleep(2000);

				// Check if user dropdown (after login) is visible
				boolean ref = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//i")).isDisplayed();

				if (ref) 
				{
					HomePage hp = new HomePage(driver);
					hp.ClickDropDown();
					hp.ClickLogout();
					Assert.assertTrue(true, "Valid login test passed.");
				} else 
				{
					Assert.fail("Expected successful login, but login failed.");
				}

			} catch (Exception e) 
			{
				Assert.fail("Expected successful login, but element not found: " + e.getMessage());
			}

		} else if (exp.equalsIgnoreCase("Invalid")) 
		{
			try {

				Thread.sleep(2000);

				boolean ref = driver.findElements(By.xpath("//span[@class='oxd-userdropdown-tab']//i")).size() > 0;

				if (ref) 
				{
					HomePage hp = new HomePage(driver);
					hp.ClickDropDown();
					hp.ClickLogout();
					Assert.fail("Expected login to fail, but login succeeded.");
				} else 
				{
					Assert.assertTrue(true, "Invalid login test passed.");
				}

			} catch (Exception e) 
			{
				Assert.assertTrue(true, "Invalid login test passed (element not present).");
			}
		}
	}

}
