package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePagObject;
import utilities.Utils;

public class HomePagStepDefination extends Base {
	
	HomePagObject homepagObject = new HomePagObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepagObject.clickOnCurrency();

	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepagObject.clickOnEruSelection();
		logger.info("");

	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepagObject.thevalueChangedToEru();
		logger.info("");
		Utils.takeScreenshotForStep();

	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepagObject.clickOnShopingCartBox();
		logger.info("");

	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homepagObject.clickOnYourShopingCartIsEmpty();
		logger.info("");
		Utils.takeScreenshotForStep();

	}

}
