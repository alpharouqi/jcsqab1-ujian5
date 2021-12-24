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
		
	@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg")
	private WebElement btnElements;
	
	@FindBy(id = "item-0")
	private WebElement listTextBox;
	
	@FindBy(id = "item-1")
	private WebElement listCheckBox;
	
	@FindBy(id = "item-2")
	private WebElement listRadioButton;
	
	@FindBy(id = "userName")
	private WebElement txtName;
	
	@FindBy(id = "userEmail")
	private WebElement txtEmail;
	
	@FindBy(id = "currentAddress")
	private WebElement txtcurrentAddress;
	
	@FindBy(id = "permanentAddress")
	private WebElement txtpermanentAddress;

	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(css = "#tree-node > div > button.rct-option.rct-option-expand-all")
	private WebElement btnExpandAll;
	
	@FindBy(css = "#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox")
	private WebElement checkListNotes;
	
	@FindBy(css = "#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox")
	private WebElement checkListReact;
	
	@FindBy(css = "#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(4) > span > label > span.rct-checkbox")
	private WebElement checkListGeneral;
	
	@FindBy(css = "#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(2) > span > label > span.rct-checkbox")
	private WebElement checkListExcel;
	
	@FindBy(id = "impressiveRadion")
	private WebElement btnRadioImpressive;
	
	public void boxElements() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnElements));
		btnElements.click();
	}
	
	public void menuTextBox() {
		listTextBox.click();
	}
	
	public void textBox(String userName, String userEmail, String currentAddress, String permanentAddress) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		txtName.sendKeys(userName);
		txtEmail.sendKeys(userEmail);
		txtcurrentAddress.sendKeys(currentAddress);
		txtpermanentAddress.sendKeys(permanentAddress);
		js.executeScript("arguments[0].scrollIntoView();", txtpermanentAddress);
		btnSubmit.click();
	}
	
	public void menuRadioButton() {
		listRadioButton.click();
		btnRadioImpressive.click();
	}
	
	public void menuCheckBox() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		listCheckBox.click();
		btnExpandAll.click();
		checkListNotes.click();
		js2.executeScript("arguments[0].scrollIntoView();", checkListNotes);
		checkListReact.click();
		checkListGeneral.click();
		checkListExcel.click();
	}

}
