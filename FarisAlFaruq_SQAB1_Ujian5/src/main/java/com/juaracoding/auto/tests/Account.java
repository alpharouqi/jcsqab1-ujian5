package com.juaracoding.auto.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.auto.drivers.DriverSingleton;

public class Account {
	
private WebDriver driver;
	
	public Account() {
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
	
	@FindBy(id = "email_create")
	private WebElement txtCreate;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnCreate;
	
	@FindBy(id = "email")
	private WebElement txtLogin;
	
	@FindBy(id = "passwd")
	private WebElement txtPasswd;
	
	@FindBy(id = "SubmitLogin")
	private WebElement btnLogin;
	
	public void signIn() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
	}
	
	public void createAccount(String email_create) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		txtCreate.sendKeys(email_create);
		btnCreate.click();
	}
	
	public void loginAccount(String email, String passwd) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		txtLogin.sendKeys(email);
		txtPasswd.sendKeys(passwd);
		btnLogin.click();
	}

}
