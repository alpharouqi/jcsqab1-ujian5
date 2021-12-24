package com.juaracoding.auto.drivers;

public class DriverImplementator {
	
	public static DriverStrategy chromeStrategy(String strategy) {
		switch (strategy) {
		case "chrome":
			return new Chrome();
		default:
			return null;
		}
	}

}
