package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BasePage {
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement username;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text--after']//i)[1]")
	WebElement dropDown;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text--after']//i)[2]")
	WebElement statusdropDown;
	
	@FindBy(xpath = "//div[@role='option']")
	WebElement enableObtion;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement admin;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement button;
	
	public void SetUsername() {
		username.sendKeys("Admin");
	}
	
	public void ClickSearch() {
		button.click();
	}
	
	public void ClickDropDown() {
		dropDown.click();
	}
	
	public void ClickAdmin() {
		admin.click();
	}
	
	public void ClickStatusDropDown() {
		statusdropDown.click();
	}
	
	public void ClickEnable() {
		enableObtion.click();
	}
	
	public void ReloadPage() {
		driver.navigate().refresh();
	}

	public void captureRecord() throws InterruptedException
	{
		Thread.sleep(2000);
	    List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']//div[@role='row']"));

	    for (WebElement row : rows) {
	        List<WebElement> cells = row.findElements(By.xpath(".//div[@role='cell']"));
	        for (WebElement cell : cells) {
	            System.out.print(cell.getText() + " | ");
	        }
	        System.out.println();
	    }
	   
	}
	    
}
