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

public class SignUp {
	
	private WebDriver driver;

	public SignUp() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Create Account
	 * Input Email
	 * Input All Data
	 */
	
	@FindBy(id = "email_create")
	private WebElement txtCreate;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnCreate;
	
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	private WebElement slctGender;
	
	@FindBy(id = "customer_firstname")
	private WebElement txtCustFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement txtCustLastName;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement txtCustPasswd;
	
	@FindBy(xpath = "//*[@id=\"days\"]")
	private WebElement slctDays;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	private WebElement slctMonths;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	private WebElement slctYears;
	
	@FindBy(id = "newsletter")
	private WebElement slctNewsletter;
	
	@FindBy(id = "optin")
	private WebElement slctOptin;
	
	@FindBy(xpath = "//*[@id=\"address1\"]")
	private WebElement txtAddress1;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement txtCity;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	private WebElement slctState;
	
	@FindBy(xpath = "//*[@id=\"postcode\"]")
	private WebElement txtPostcode;
	
	@FindBy(xpath = "//*[@id=\"id_country\"]")
	private WebElement slctCountry;
	
	@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
	private WebElement txtPhoneMobile;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAccount;
	
	public void createAccount(String email_create) {
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(btnCreate));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)");
	txtCreate.sendKeys(email_create);
	btnCreate.click();
	}

	public void createPersonalForm(String firstname, String lastname, String passwd) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(slctGender));
		slctGender.click();
		txtCustFirstName.sendKeys(firstname);
		txtCustLastName.sendKeys(lastname);
		txtCustPasswd.sendKeys(passwd);
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

	public void createAddressForm(String address1, String city, String postcode, String phone_mobile) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(txtCustFirstName));
		txtAddress1.sendKeys(address1);
		txtCity.sendKeys(city);
		txtPostcode.sendKeys(postcode);
		txtPhoneMobile.sendKeys(phone_mobile);
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

}
