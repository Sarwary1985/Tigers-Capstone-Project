package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPagObject extends Base {

	public RetailPagObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountOnLogin;

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement regesterForAffiliateAcct;

	@FindBy(id = "input-company")
	private WebElement companyName;

	@FindBy(id = "input-website")
	private WebElement websiteField;

	@FindBy(id = "input-tax")
	private WebElement taxIdField;

	@FindBy(id = "input-cheque")
	private WebElement chequePayField;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	private WebElement aboutUsBox;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement cobtinueButtonn;
	
	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]/text()")
	private WebElement successMassegeFromUI;
	/**
	 * second scenario xpath start her
	 */
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliatInformation;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement bankTransferButton;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankName;
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumber;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement bankSwiftCode;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement bankAccountName;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement bankAccountNumber;
	/**
	 *  xpath for third scenario
	 */
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccount;
	
	@FindBy(id = "input-firstname")
	private WebElement fistName;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNames;
	
	@FindBy(id = "input-email")
	private WebElement emailAddress;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmeil(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean validatMyAccountOnLogin() {
		if (myAccountOnLogin.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnRegesterForAffiliateAcct() {
		regesterForAffiliateAcct.click();
	}

	public void entercompanyName(String company) {
		companyName.sendKeys(company);
	}

	public void enterWebsit(String website) {
		websiteField.sendKeys(website);
	}

	public void enterTaxId(String tax) {
		taxIdField.sendKeys(tax);
	}

	public void enterChequePayField(String cheque) {
		chequePayField.sendKeys(cheque);
	}

	public void clickOnAboutUsBox() {
		aboutUsBox.click();
	}

	public void clickOnCobtinueButton() {
		cobtinueButtonn.click();
	}
	public boolean getSuccessMassegeFromUI() {
		if(successMassegeFromUI.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * second scenario step start here
	 */
	public void clickOnEditAffiliatInformation() {
		editAffiliatInformation.click();
	}
	public void clickOnBankTransferButton() {
		bankTransferButton.click();
	}
	public void enterBankName(String bank) {
		bankName.sendKeys(bank);
		
	}
	public void enterabaNumber(String aba) {
		abaNumber.sendKeys(aba);
	}
	public void enterBankSwiftCode(String swift) {
		bankSwiftCode.sendKeys(swift);
	}
	public void enterBankAccountName(String account) {
		bankAccountName.sendKeys(account);
	}
	public void enterBankAccountNumber(String accountNumber) {
		bankAccountNumber.sendKeys(accountNumber);
	}
	/**
	 *  third scenario steps
	 */
	public void clickOnEditYourAccount() {
		editYourAccount.click();
	}
	public void enterfistName(String fNames) {
		fistName.sendKeys(fNames);
	}
	public void enterlastNames(String lName) {
		lastNames.sendKeys(lName);
	}
	public void enteremailAddress(String emailAdd) {
		emailAddress.sendKeys(emailAdd);
	}
	public void entertelephoneField(String telephone) {
		telephoneField.sendKeys(telephone);
	}

}
