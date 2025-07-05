package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']//i")
	WebElement dropdown;

	@FindBy(xpath = "(//ul[@role='menu']/li)[4]")
	WebElement button;
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement admin;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']//li//a//span")
	List<WebElement> allOptions;

	public void ClickDropDown() {
		dropdown.click();
	}

	public void ClickLogout() {
		button.click();
	}
	
	public void ClickAdmin() {
		admin.click();
	}
	
	public void getAllOptions() {
		for(WebElement ref: allOptions)
		{
			System.out.println(ref.getText());
		}
	}

}
