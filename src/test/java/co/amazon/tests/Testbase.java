package co.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Testbase {

	public static WebDriver driver = null;
    // method to initialize browser driver;
	@BeforeTest
	public void initialize() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		// driver.manage().window().maximize();

	}
	// method to quit browser 
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		System.out.print("ji quitting");
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
