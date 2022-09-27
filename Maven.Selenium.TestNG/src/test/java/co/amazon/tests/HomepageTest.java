package co.amazon.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.support.PageFactory;

import co.amazon.pages.AmazonHomePage;
import co.amazon.pages.AmazonLoginPage;

public class HomepageTest extends Testbase {

	@Test(priority = 1)
	public void login() {

		try {
			AmazonLoginPage ap = PageFactory.initElements(driver, AmazonLoginPage.class);
			ap.SignIn("rk97606@gmail.com", "123456789");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void init1() {
		try {

			AmazonHomePage hp = PageFactory.initElements(driver, AmazonHomePage.class);
			hp.inputSearchbox("mobile phones");
			hp.submitsearch();
			hp.scrolldownandhome();
			hp.titleverify();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
