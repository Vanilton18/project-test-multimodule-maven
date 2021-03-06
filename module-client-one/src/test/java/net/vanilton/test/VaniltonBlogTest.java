package net.vanilton.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.vanilton.pageObject.MainPage;

public class VaniltonBlogTest extends BaseTest {

	MainPage main;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp(){
		main = new MainPage(driver);
	}
	
	@Test
	public void verificandoTitulosdosMenu() {
		main.waitLoadingPost();
		main.verifyCurrentPostSelect();
	}

}
