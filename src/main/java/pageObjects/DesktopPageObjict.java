package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObjict extends Base {

	public DesktopPageObjict() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnviromentText;

	@FindBy(xpath = "//a[text()='Desktops']") 
	private WebElement desktops;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDestops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;

	@FindBy(id = "input-quantity")
	private WebElement quantityInput;

	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	/**
	 * when there is text (/text()) at the end of our xpath the retuen type will be
	 * string for example private String
	 */
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/text()")
	private String successmessage;
	/**
	 * the third scenario xpath satart here
	 * 
	 */
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement canonEOS5DCamera;
	
	/**
	 * 
	 * last scenario xpath from desktop tad
	 */
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCameree;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReview;
	
	@FindBy(id = "input-name")
	private WebElement nameField;
	
	@FindBy(id = "input-review")
	private WebElement reviewField;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(id = "button-review")
	private WebElement continueButton;
	
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	public String getTestEnvironmentText() {
	String textFromUI = testEnviromentText.getText();
	return textFromUI;
	}

	public void clickonDesktopsTab() {
		desktops.click();

	}

	public void clickOnShowAllDesktops() {
		showAllDestops.click();
	}

	public List<WebElement> desktopsItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}

	public void clickOnaHPLP3065Item() {
		hpLP3065.click();
	}

	public void selectQuantity(String quantitiyValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantitiyValue);
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public String successMessage() {
		return successmessage;
	}
	public void clickOncanonEOS5D() {
		canonEOS5DCamera.click();
	}
	public void clickOnCanonEOS5DCamere() {
		canonEOS5DCameree.click();
		
	}
	public void clickOnWriteReview() {
		writeReview.click();
	}
	public void enterYourName(String nameValue) {
		nameField.sendKeys(nameValue);
	}
	public void enteryourReview(String reviewValue) {
		reviewField.sendKeys(reviewValue);
	}
	public void selectRating(String ratingvalue) {
		List<WebElement> ratingElement = rating;
		for(WebElement element:ratingElement) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingvalue.trim())) {
				element.click();
				break;
			}
		}
		
	}
	public void clickOnCoontinueButton() {
		continueButton.click();
	}
	public String reviewText() {
		return reviewSubmissionMessage;
	}

}
