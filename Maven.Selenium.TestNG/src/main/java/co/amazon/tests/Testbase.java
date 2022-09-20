package co.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Testbase {

	public static WebDriver driver = null;

	@BeforeTest
	public void initialize() throws IOException {
		System.out.print("browser class ji");
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterTest
	public void teardown() {
		System.out.print("ji quitting");
		driver.close();
	}
}
