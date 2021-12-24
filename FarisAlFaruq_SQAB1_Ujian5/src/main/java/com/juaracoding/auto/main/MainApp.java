package com.juaracoding.auto.main;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.auto.drivers.DriverSingleton;
import com.juaracoding.auto.tests.Account;
import com.juaracoding.auto.tests.Cart;
import com.juaracoding.auto.tests.Checkout;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		
		Account account = new Account();
		account.signIn();
		account.createAccount("test@email.com");
		account.loginAccount("test@email.com","test1234");
		
		Cart cart = new Cart();
//		cart.menuAdd();
		
		Checkout checkout = new Checkout();
//		account.menuAdd();

	}

}
