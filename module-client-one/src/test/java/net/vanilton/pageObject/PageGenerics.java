package net.vanilton.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.vanilton.core.utils.Utils;

public abstract class PageGenerics {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Utils util;

	public PageGenerics(WebDriver driver) {
		util = new Utils();
		this.driver = driver;
		wait = new WebDriverWait(driver, Long.parseLong(util.getProperty("timeoutDefault")));
	}

	/**
	 * Método de clique genérico nos posts
	 * @param name
	 */
	public void clickMainPost(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(name)));
		driver.findElement(By.linkText(name)).click();
	}

	/***
	 * Método genérico para verificar presença do post selecionado.
	 * @param title
	 * @return boolean
	 */
	public boolean isPresentTitlePost(String title) {
		return wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//header[@class='entry-header' and contains(.,'"+title+"')]")))
				.isDisplayed();
	}
	
	public void waitLoadingPost(){
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	}
}
