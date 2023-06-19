package co.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonLoginPage {

	// Finding the path for web elements.
	@FindBy(how = How.ID, using = "ap_email")
	WebElement email;
	@FindBy(how = How.ID, using = "continue")
	WebElement continue1;
	@FindBy(how = How.ID, using = "ap_password")
	WebElement password;
	@FindBy(how = How.ID, using = "signInSubmit")
	WebElement signin;
	@FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
	WebElement link1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")
	WebElement home;

	// method to put input in fields and click on next button;
	public void SignIn(String mail, String pass) {
		try {

			link1.click();

			email.sendKeys(mail);
			continue1.click();

			password.sendKeys(pass);
			signin.click();

			home.click();
		} catch (Exception e) {
			System.out.print("im in login method  " + e);
			
		}
	}
}
