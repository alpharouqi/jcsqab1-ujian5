package com.juaracoding.auto.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.auto.drivers.DriverSingleton;

public class Checkout {
	
private WebDriver driver;
	
	public Checkout() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Checkout
	 * Proceed Checkout item in cart
	 * Summary Entry
	 * Add Address if necessary
	 * Shipping
	 * Payment
	 */
		
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	private WebElement btnCheckOut;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement btnSummary;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement btnAddress;
	
	@FindBy(id = "cgv")
	private WebElement slctCgv;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement btnShipping;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement btnWirePayment;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement btnConfirm;
	
	public void checkOutThing() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckOut));
		btnCheckOut.click();
		btnSummary.click();
	}
	
	public void checkAddress() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckOut));
		btnAddress.click();
	}
	
	public void checkShipping() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckOut));
		slctCgv.click();
		btnShipping.click();
	}
	
	public void checkPayment() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckOut));
		btnWirePayment.click();
	}

}
