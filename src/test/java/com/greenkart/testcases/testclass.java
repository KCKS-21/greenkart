package com.greenkart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.greenkart.base.BaseClass;
import com.greenkart.pageobjects.HomePage;

public class testclass extends BaseClass {
	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void verifyProduct() {
		HomePage h1 = new HomePage();
		h1.searchProduct("brocolli");
	}
}
