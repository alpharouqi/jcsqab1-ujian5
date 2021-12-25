package com.juaracoding.auto.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.auto.drivers.DriverSingleton;
import com.juaracoding.auto.tests.Account;
import com.juaracoding.auto.tests.Cart;
import com.juaracoding.auto.tests.Checkout;

public class MainApp {

	public static void main(String[] args) {
		DriverSingleton.getInstance();
		WebDriver driver = DriverSingleton.getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		
		Account account = new Account();
		account.signIn();
		//If
		account.createAccount("wefah83264@ehstock.com");
		account.createPersonalForm("ABC", "DEF");
		account.slctDays(9);
		account.slctMonths(9);
		account.slctYears(1999);
		account.createAddressForm("ABC", "DEF", "NY", "NY", "10000", "62812345", "My Adress");
		account.slctState(9);
		account.slctCountry(1);
		account.loginAccount("test@email.com","test1234");
				
		driver.get("http://automationpractice.com/index.php");
				
		Cart cart = new Cart();
		cart.addThing();
		
		Checkout checkout = new Checkout();
		checkout.checkOutThing();
		checkout.checkAddress();
		checkout.checkShipping();
		checkout.checkPayment();
	}

}
