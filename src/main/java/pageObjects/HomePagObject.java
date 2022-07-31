package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePagObject extends Base {

	public HomePagObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement eruSelection;

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement valueChangedToEru;

	/**
	 * second Scenario xpath
	 */
	@FindBy(xpath = "//*[@id=\"cart\"]/button ")
	private WebElement shopingCartBox;

	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement yourShopingCartIsEmpty;

	public void clickOnCurrency() {
		currency.click();
	}

	public void clickOnEruSelection() {
		eruSelection.click();
	}

	public boolean thevalueChangedToEru() {
		if (valueChangedToEru.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnShopingCartBox() {
		shopingCartBox.click();
	}

	public boolean clickOnYourShopingCartIsEmpty() {
		if (yourShopingCartIsEmpty.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}