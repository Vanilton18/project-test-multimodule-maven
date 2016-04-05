package net.vanilton.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage extends PageGenerics {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyCurrentMainPageSection(){
		clickMainTabMenu("Home");
		Assert.assertTrue(isPresentTitleSectionPage("Home"));
		clickMainTabMenu("Tutoriais");
		Assert.assertTrue(isPresentTitleSectionPage("Tutoriais"));
		clickMainTabMenu("Publicações");
		Assert.assertTrue(isPresentTitleSectionPage("Publicações"));
		clickMainTabMenu("Sobre");
		Assert.assertTrue(isPresentTitleSectionPage("Sobre Vanilton Pinheiro"));
		clickMainTabMenu("Contato");
		Assert.assertTrue(isPresentTitleSectionPage("Contato"));
	}

}
