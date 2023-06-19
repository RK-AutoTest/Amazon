package co.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonSignUpPage {

	// finding elements from Web page using @FindBy.
	@FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
	WebElement signin;
	@FindBy(how = How.ID, using = "createAccountSubmit")
	WebElement createAccount;
	@FindBy(how = How.ID, using = "ap_customer_name")
	WebElement name;
	@FindBy(how = How.ID, using = "ap_email")
	WebElement email;
	@FindBy(how = How.ID, using = "ap_password")
	WebElement pass;
	@FindBy(how = How.ID, using = "ap_password_check")
	WebElement confirmpass;
	@FindBy(how = How.ID, using = "continue")
	WebElement next;
	@FindBy(how = How.XPATH, using = "//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")
	WebElement home;

	// method to reach on sign up page and input all the required fields
	public void signupage(String nm, String mail, String ps) {
		signin.click();
		createAccount.click();
		name.sendKeys(nm);
		email.sendKeys(mail);
		pass.sendKeys(ps);
		confirmpass.sendKeys(ps);
		next.click();
		home.click();
	}

}
