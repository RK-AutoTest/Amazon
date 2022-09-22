package co.amazon.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.support.PageFactory;

import co.amazon.pages.AmazonHomePage;

public class HomepageTest extends Testbase {

	@Test
	public void init() {
		try {
			System.out.print("im in test ");
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
