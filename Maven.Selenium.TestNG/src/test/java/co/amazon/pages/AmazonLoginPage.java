package co.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonLoginPage {
	WebDriver driver;

	AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Finding the path for web elements.
	@FindBy(how = How.ID, using = "ap_email")
	WebElement email;
	@FindBy(how = How.ID, using = "continue")
	WebElement continue1;
	@FindBy(how = How.ID, using = "ap_password")
	WebElement password;
	@FindBy(how = How.ID, using = "signInSubmit")
	WebElement signin;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span")
	WebElement link;
	
	// method to put input in fields and click on next button;
	public void signin(String mail, String pass) {
		try {
			System.out.print("bbbbbbbbbbbbbbbbb  ");
			link.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.print("bbbbbbbbbbbbbbbbb  ");
			email.sendKeys("mail");
			continue1.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			password.sendKeys("pass");
			signin.click();
		} catch (Exception e) {
			System.out.print("im in login method  "+e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
