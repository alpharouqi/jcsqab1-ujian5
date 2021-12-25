package com.juaracoding.auto.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.auto.drivers.DriverSingleton;

public class LogIn {
	
private WebDriver driver;
	
	public LogIn() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Create Account
	 * Input Email
	 * Input All Data
	 */
		
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement btnSignIn;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement txtLoginEmail;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement txtLoginPasswd;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	private WebElement btnLogIn;
	
	@FindBy(xpath = "//*[@id=\"header_logo\"]/a")
	private WebElement headerHome;
	
	public void signIn() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
	}
	
	public void logIn(String emailLogin, String passwdLogin) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		txtLoginEmail.sendKeys(emailLogin);
		txtLoginPasswd.sendKeys(passwdLogin);
		btnLogIn.click();
		headerHome.click();
	}
	
}
