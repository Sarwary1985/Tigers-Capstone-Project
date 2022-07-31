package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPagObject;
import utilities.Utils;

public class RetailStepDifination extends Base {

	RetailPagObject retailpageobject = new RetailPagObject();

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailpageobject.clickOnMyAccount();
		logger.info("");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailpageobject.clickOnLogin();
		logger.info("");

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retailpageobject.enterEmeil(string);
		retailpageobject.enterPassword(string2);
		logger.info("");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobject.clickOnLoginButton();
		logger.info("");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		boolean actualText = retailpageobject.validatMyAccountOnLogin();
		Assert.assertEquals(expectedText, actualText);
		retailpageobject.validatMyAccountOnLogin();
		logger.info("");
		Utils.takeScreenshotForStep();

	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailpageobject.clickOnRegesterForAffiliateAcct();
		logger.info("");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInfromation = dataTable.asMaps(String.class, String.class);
		retailpageobject.entercompanyName(reviewInfromation.get(0).get("company"));
		retailpageobject.enterWebsit(reviewInfromation.get(0).get("website"));
		retailpageobject.enterTaxId(reviewInfromation.get(0).get("taxID"));
		retailpageobject.enterChequePayField(reviewInfromation.get(0).get("paymentMethod"));
		logger.info("");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobject.clickOnAboutUsBox();
		logger.info("");

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpageobject.clickOnCobtinueButton();
		logger.info("");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message(String expectedSuccessMessage) {

		Assert.assertEquals(retailpageobject.getSuccessMassegeFromUI(), expectedSuccessMessage);
		logger.info("");
		Utils.takeScreenshotForStep();

	}

	/**
	 * econd step Def
	 */
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailpageobject.clickOnEditAffiliatInformation();
		logger.info("");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobject.clickOnBankTransferButton();
		logger.info("");

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> accessInformation = dataTable.asMaps(String.class, String.class);
		retailpageobject.enterBankName(accessInformation.get(0).get("bankName"));
		retailpageobject.enterabaNumber(accessInformation.get(0).get("abaNumber"));
		retailpageobject.enterBankSwiftCode(accessInformation.get(0).get("swiftCode"));
		retailpageobject.enterBankAccountName(accessInformation.get(0).get("accountName"));
		retailpageobject.enterBankAccountNumber(accessInformation.get(0).get("accountNumber"));
		logger.info("");
		Utils.takeScreenshotForStep();

	}

	/**
	 * third scenario steps start here
	 */
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailpageobject.clickOnEditYourAccount();

	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> accountInformation = dataTable.asMaps(String.class, String.class);
		retailpageobject.enterfistName(accountInformation.get(0).get("firstname"));
		retailpageobject.enterlastNames(accountInformation.get(0).get("lastName"));
		retailpageobject.enteremailAddress(accountInformation.get(0).get("email"));
		retailpageobject.entertelephoneField(accountInformation.get(0).get("telephone"));

	}

}
