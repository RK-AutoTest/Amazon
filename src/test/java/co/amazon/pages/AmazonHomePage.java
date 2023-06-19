package co.amazon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.AssertJUnit;

public class AmazonHomePage {

	WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// using @findBy to locate element on amazon home page.
	@FindBy(how = How.XPATH, using = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement text1;
	@FindBy(how = How.ID, using = "nav-search-submit-button")
	WebElement submit1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-logo-sprites\"]")
	WebElement home;

	// method to put input in input field.
	public void inputSearchbox(String strsearch) {
		try {
			System.out.print("im in homepage input  ");
			text1.sendKeys(strsearch);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// method to click on search button.
	public void submitsearch() {
		try {

			submit1.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// method to verify page title.

	public void titleverify() {
		try {
			String title = driver.getTitle();
			AssertJUnit.assertEquals("Amazon.com. Spend less. Smile more.", title);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	// method to scroll down the page and click on home page icon.
	public void scrolldownandhome() {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000)");
			Thread.sleep(3000);
			home.click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}