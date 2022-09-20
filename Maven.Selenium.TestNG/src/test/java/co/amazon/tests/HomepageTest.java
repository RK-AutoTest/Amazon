package co.amazon.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.amazon.pages.AmazonHomePage;

public class HomepageTest extends Testbase {
	@Test
	public void init() {
		try {
			System.out.print("im in test ");
			AmazonHomePage hp = PageFactory.initElements(driver, AmazonHomePage.class);
			hp.inputSearchbox("mobile phones");
			hp.submitsearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
//method to verify page title.
	public void titleverify() {
		String title = driver.getTitle();
		Assert.assertEquals("Amazon.com. Spend less. Smile more.", title);
	}
}
