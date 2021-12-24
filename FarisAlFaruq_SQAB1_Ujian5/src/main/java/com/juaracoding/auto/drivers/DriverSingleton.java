package com.juaracoding.auto.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.auto.drivers.DriverSingleton;

public class DriverSingleton {
	
	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	public DriverSingleton() {
		intatiance("chrome");
	}
	
	public WebDriver intatiance (String strategy) {
		DriverStrategy driverstrategy = DriverImplementator.chromeStrategy(strategy); 
		driver = driverstrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static DriverSingleton getInstance() {
		if(instance == null) {
		instance = new DriverSingleton();
		}
	return instance;
	}
	
	public static void closeObjectInstance() {
		instance = null;
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
