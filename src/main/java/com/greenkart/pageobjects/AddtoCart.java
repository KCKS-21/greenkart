package com.greenkart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greenkart.actiondriver.Action;
import com.greenkart.base.BaseClass;

public class AddtoCart extends BaseClass {
	Action act = new Action();
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addtocart;

	@FindBy(xpath = "//img[@alt='cart']")
	private WebElement cart;

	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement checkout;

	public AddtoCart() {
		PageFactory.initElements(driver, this);
	}

	public void checkout() {
		act.click(driver, addtocart);
		act.click(driver, cart);
		act.click(driver, checkout);
	}
}
