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
		
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")
	private WebElement btnAddShirt;
	
	@FindBy(id = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement shoppingAgain;
	
	@FindBy(id = "//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]")
	private WebElement btnAddDress;
		
	public void addThing() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddShirt));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		btnAddShirt.click();
		shoppingAgain.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,100)");
		btnAddDress.click();
	}

}
