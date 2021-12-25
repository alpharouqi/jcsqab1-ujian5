package com.juaracoding.auto.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.auto.drivers.DriverSingleton;
import com.juaracoding.auto.tests.LogIn;
import com.juaracoding.auto.tests.Cart;
import com.juaracoding.auto.tests.Checkout;

public class MainApp {

	public static void main(String[] args) {
		DriverSingleton.getInstance();
		WebDriver driver = DriverSingleton.getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		LogIn login = new LogIn();
		login.signIn();
		login.logIn("wefah83264@ehstock.com", "test1234");
		
//		SignUp signup = new SignUp();
//		signup.createAccount("wefah83264@ehstock.com");
//		signup.createPersonalForm("ABC", "DEF", "test1234");
//		signup.createAddressForm("Los Angeles", "New York", "10000", "62812345");
//		signup.slctDays(9);
//		signup.slctMonths(9);
//		signup.slctYears(24);
//		signup.slctState(9);
//		signup.slctCountry(1);
					
		Cart cart = new Cart();
		cart.addThing();
		cart.shoppingAgain();
		cart.addMoreThing();
		
		Checkout checkout = new Checkout();
		checkout.checkOutThing();
		checkout.checkAddress();
		checkout.checkShipping();
		checkout.checkPayment();
		checkout.confirmPayment();
	}

}