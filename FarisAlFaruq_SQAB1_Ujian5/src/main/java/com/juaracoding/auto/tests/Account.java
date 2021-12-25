package com.juaracoding.auto.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(id = "id_gender")
	private WebElement chkcGender;
	
	@FindBy(id = "firstname")
	private WebElement txtCustFirstName, txtFirstName;
	
	@FindBy(id = "lastname")
	private WebElement txtCustLastName, txtLastName;
	
	@FindBy(id = "days")
	private WebElement slctDays;
	
	@FindBy(id = "months")
	private WebElement slctMonths;
	
	@FindBy(id = "years")
	private WebElement slctYears;
	
	@FindBy(id = "newsletter")
	private WebElement slctNewsletter;
	
	@FindBy(id = "optin")
	private WebElement slctOptin;
	
	@FindBy(id = "address1")
	private WebElement txtaddress1;
	
	@FindBy(id = "city")
	private WebElement txtCity;
	
	@FindBy(id = "id_state")
	private WebElement slctState;
	
	@FindBy(id = "postcode")
	private WebElement txtPostcode;
	
	@FindBy(id = "id_country")
	private WebElement slctCountry;
	
	@FindBy(id = "phone_mobile")
	private WebElement txtPhoneMobile;
	
	@FindBy(id = "alias")
	private WebElement txtAlias;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAccount;
	
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
	
	public void createPersonalForm(String firstname, String lastname) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(chkcGender));
		chkcGender.click();
		txtCustFirstName.sendKeys(firstname);
		txtCustLastName.sendKeys(lastname);
		slctNewsletter.click();
		slctOptin.click();
	}
	
	public void slctDays(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(slctDays));
		slctDays.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i=0; i<selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); 
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void slctMonths(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(slctMonths));
		slctMonths.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i=0; i<selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); 
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void slctYears(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(slctYears));
		slctYears.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i=0; i<selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); 
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void createAddressForm(String firstname, String lastname, String address1, String city, String postcode, String phone_mobile, String alias) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(txtCustFirstName));
		txtFirstName.sendKeys(firstname);
		txtLastName.sendKeys(lastname);
		txtaddress1.sendKeys(address1);
		txtCity.sendKeys(city);
		txtPostcode.sendKeys(postcode);
		txtPhoneMobile.sendKeys(phone_mobile);
		txtAlias.sendKeys(alias);
		btnSubmitAccount.click();
	}
	
	public void slctState(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(slctState));
		slctState.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i=0; i<selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); 
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void slctCountry(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(slctCountry));
		slctCountry.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i=0; i<selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); 
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void loginAccount(String email, String passwd) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		txtLogin.sendKeys(email);
		txtPasswd.sendKeys(passwd);
		btnLogin.click();
	}

}
