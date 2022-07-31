package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNotBooksPageObject extends Base {

	public LaptopNotBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNoteBooks;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNoteBooks;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	/**
	 * second scenario xpath
	 */
	@FindBy(xpath = "//button[contains(@onclick,\"compare.add('43');\")]")
	private WebElement macBookComperisonButton;

	@FindBy(xpath = "//button[contains(@onclick,\"compare.add('44');\")]")
	private WebElement macBookAircomperisonButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement productComperisonChart;

	/**
	 * third scenario xpath
	 */
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement addSonyVAIOToWishLishList;
	/**
	 * forth scenario xpaths
	 */
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProItems;

	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceIsPresent;

	public void clickOnLaptopAndNoteBooks() {
		laptopAndNoteBooks.click();
	}

	public void clickOnShowAllLaptopAndNoteBooks() {
		showAllLaptopAndNoteBooks.click();
	}

	public void clickMacBookItem() {
		macBookItem.click();
	}

	/**
	 * second scenario methods
	 */
	public void clickOnMacBookComperisonButton() {
		macBookComperisonButton.click();
	}

	public void clickOnmacBookAircomperisonButton() {
		macBookAircomperisonButton.click();
	}

	public boolean userSeeProductCompchart() {
		if (productComperisonChart.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnAddSonyVAIOToWishLishList() {
		addSonyVAIOToWishLishList.click();
	}

	public void clickOnMacBookProItems() {
		macBookProItems.click();
	}
	public boolean thePriceIsPresent() {
		if(priceIsPresent.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}

}
