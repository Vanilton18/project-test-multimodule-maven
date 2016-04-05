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
	 * Método de clique genérico dos Menus.
	 * @param name
	 */
	public void clickMainTabMenu(String name) {
		driver.findElement(By.xpath("//a[contains(@class,'mdl-layout__tab') and text()='" + name + "']")).click();
	}

	/***
	 * Método genérico para verificar presença do menu selecionado.
	 * @param title
	 * @return boolean
	 */
	public boolean isPresentTitleSectionPage(String title) {
		return wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(@class,'is-active')]//*[text()='" + title + "']")))
				.isDisplayed();
	}
}
