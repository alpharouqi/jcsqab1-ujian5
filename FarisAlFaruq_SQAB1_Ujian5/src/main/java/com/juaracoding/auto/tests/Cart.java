package com.juaracoding.auto.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.auto.drivers.DriverSingleton;

public class Cart {
	
private WebDriver driver;
	
	public Cart() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Add to Cart 
	 * 1 Dress
	 * 1 T-Shirt
	 */
		
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div")
	private WebElement hvrShirt;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	private WebElement btnAddShirt;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement shoppingAgain;
	
//	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a[1]")
//	private WebElement returnHome;
	
	@FindBy(xpath = "//*[@id=\"header_logo\"]/a")
	private WebElement headerHome;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[5]/div")
	private WebElement hvrDress;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	private WebElement btnAddDress;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	private WebElement btnCheckOut;
		
	public void addThing() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(hvrShirt));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		hvrShirt.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");
		btnAddShirt.click();
	}
	
	public void shoppingAgain() {
		shoppingAgain.click();
//		returnHome.click();
		headerHome.click();
	}
	
	public void addMoreThing() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		hvrDress.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");
		btnAddDress.click();
		btnCheckOut.click();
	}

}
