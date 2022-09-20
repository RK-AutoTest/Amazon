package co.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AmazonHomePage {

	WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// using @findBy to locate element on amazon home page.
	@FindBy(how = How.XPATH, using = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement text;
	@FindBy(how = How.ID, using = "nav-search-submit-button")
	WebElement submit;

	// method to put input in input field.
	public void inputSearchbox(String strsearch) {
		try {
			System.out.print("im in page input  ");
			text.sendKeys(strsearch);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// method to click on search button.
	public void submitsearch() {
		try {
			System.out.print("im in page click ");
			submit.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}