package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.DesktopPageObjict;
import utilities.Utils;

public class DesktopPageStepDifenition extends Base {

	DesktopPageObjict desktoPage = new DesktopPageObjict();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = desktoPage.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Text Test Environment was verified");

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoPage.clickonDesktopsTab();
		logger.info("user click on desktop tab");
		Utils.takeScreenshotForStep();

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoPage.clickOnShowAllDesktops();
		logger.info("user click on show all desktops");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktoPage.desktopsItems();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue((element.isDisplayed()));
			logger.info(element.getAttribute("title") + "is present");
		}
		Utils.takeScreenshotForStep();

	}

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoPage.clickOnaHPLP3065Item();
		logger.info("user click on add to cart button");

	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktoPage.selectQuantity(string);
		logger.info("user clicked on quantity");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktoPage.clickOnAddToCartButton();
		logger.info("user clicked on cartbutton");

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		System.out.println(desktoPage.successMessage() + " this is from print");
		logger.info("user should see a success message");

	}

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktoPage.clickOncanonEOS5D();
		logger.info("user clicked on the button");
		Utils.takeScreenshotForStep();

	}
	/**
	 * last scenario from desktop tab
	 */

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktoPage.clickOnCanonEOS5DCamere();

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktoPage.clickOnWriteReview();
		

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> reviewInfromation = dataTable.asMaps(String.class,String.class);
		desktoPage.enterYourName(reviewInfromation.get(0).get("yourname"));
		desktoPage.enteryourReview(reviewInfromation.get(0).get("yourReview"));
		desktoPage.selectRating(reviewInfromation.get(0).get("Rating"));
		

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktoPage.clickOnCoontinueButton();

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		System.out.println(desktoPage.reviewText() + " from print");

	}

}
