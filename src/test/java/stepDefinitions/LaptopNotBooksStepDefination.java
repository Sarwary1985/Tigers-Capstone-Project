package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopNotBooksPageObject;
import utilities.Utils;

public class LaptopNotBooksStepDefination extends Base {

	LaptopNotBooksPageObject laptopNotBookpageObj = new LaptopNotBooksPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNotBookpageObj.clickOnLaptopAndNoteBooks();
		logger.info("");

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNotBookpageObj.clickOnShowAllLaptopAndNoteBooks();
		logger.info("");

	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNotBookpageObj.clickMacBookItem();
		logger.info("");
		Utils.takeScreenshotForStep();

	}

	/**
	 * second scenario from laptop and note book
	 */

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopNotBookpageObj.clickOnMacBookComperisonButton();
		logger.info("");

	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopNotBookpageObj.clickOnmacBookAircomperisonButton();
		logger.info("");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopNotBookpageObj.userSeeProductCompchart();
		logger.info("");
		Utils.takeScreenshotForStep();

	}

	/**
	 * third scenario from laoptap and not book
	 */
	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopNotBookpageObj.clickOnAddSonyVAIOToWishLishList();
		logger.info("");
		Utils.takeScreenshotForStep();

	}
	@When("User click on ‘MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		laptopNotBookpageObj.clickOnMacBookProItems();
		logger.info("");
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		laptopNotBookpageObj.thePriceIsPresent();
		Utils.takeScreenshotForStep();
		logger.info("");

	}

}
