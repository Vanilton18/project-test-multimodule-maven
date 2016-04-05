package net.vanilton.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.vanilton.core.utils.SeleniumUtils;
import net.vanilton.core.utils.Utils;

public class BaseTest {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Utils util;
	
	@BeforeMethod(alwaysRun = true)
	public void setUpBase(){
		util = new Utils();
		driver = SeleniumUtils.googleChrome();
		driver.get(util.getProperty("urlSite"));
	}

	@AfterMethod(alwaysRun = true)
	public void tearDownBase(){
		driver.quit();
	}
	
}
