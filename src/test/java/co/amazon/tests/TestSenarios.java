package co.amazon.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.support.PageFactory;

import co.amazon.pages.AmazonHomePage;
import co.amazon.pages.AmazonLoginPage;
import co.amazon.pages.AmazonSignUpPage;

public class TestSenarios extends Testbase {

	@Test(priority = 1)
	public void login() {

		try {
			AmazonLoginPage ap = PageFactory.initElements(driver, AmazonLoginPage.class);
			ap.SignIn("rk97606@gmail.com", "123456789");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	@Test(priority = 2)
	public void signup() {
		try {
			AmazonSignUpPage sp = PageFactory.initElements(driver, AmazonSignUpPage.class);
			sp.signupage("rohit", "rk97606@gmail.com", "12345@33");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void homesearchbox() {
		try {

			AmazonHomePage hp = PageFactory.initElements(driver, AmazonHomePage.class);
			hp.inputSearchbox("mobile phones");
			hp.submitsearch();
			hp.scrolldownandhome();
			hp.titleverify();

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
