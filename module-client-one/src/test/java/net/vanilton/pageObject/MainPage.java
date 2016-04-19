package net.vanilton.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage extends PageGenerics {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyCurrentPostSelect(){
		clickMainPost("Automatização de game mobile utilizando Sikuli");
		Assert.assertTrue(isPresentTitlePost("Automatização de game mobile utilizando Sikuli"));
	}

}
