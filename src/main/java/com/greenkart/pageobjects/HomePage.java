package com.greenkart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greenkart.actiondriver.Action;
import com.greenkart.base.BaseClass;

public class HomePage extends BaseClass {
	Action act = new Action();
	@FindBy(xpath = "//input[@class='search-keyword']")
	WebElement searchbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void searchProduct(String vegetable) {
		act.type(searchbox, vegetable);
		act.click(driver, search);
	}
}
