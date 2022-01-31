package com.greenkart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greenkart.actiondriver.Action;
import com.greenkart.base.BaseClass;

public class OrderPage extends BaseClass {
	Action act = new Action();
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement order;

	public OrderPage() {
		PageFactory.initElements(driver, this);
	}

	public void placeOrder() {
		act.click(driver, order);
	}
}
