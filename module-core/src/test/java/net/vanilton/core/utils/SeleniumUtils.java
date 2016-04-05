package net.vanilton.core.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtils {

	public static WebDriver driver;
	
	public static WebDriver googleChrome() {
		// Define ChromeDriver into path variable
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver MozillaFirefoxChrome() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
