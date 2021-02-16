package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	// Once we create Page Obj we need to extend the Base class to use Parent Class
	// Properties such as Webdriver
	// We create a constructor and inside the constructor, we define the
	// PageFactory.initElements
	// method to initialize the WebElements in this page.

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	// we need to store UI Webelements in a private webElement using @FindBy
	// annotations
	// of PageFactory class.

	@FindBy(xpath = "//input[@name = 'search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class = 'btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title = 'iPhone']")
	private WebElement iphoneImage;

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macbookImage;

	@FindBy(xpath = "//img[@alt = 'Apple Cinema 30\"']")
	private WebElement appleCinemaImage;

	@FindBy(xpath = "//img[@title = 'Canon EOS 5D']")
	private WebElement canonImage;

	// WeElements for Register page

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerOption;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(css = "#input-telephone")
	private WebElement telephoneField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "(//input[@value = '1'])[1]")
	private WebElement yesSubscribeButton;

	@FindBy(xpath = "(//input[@ value = '0'])[1]")
	private WebElement noSubscribeButton;

	@FindBy(xpath = "//input [@ type = 'checkbox']")
	private WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//input[@value = 'Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;

	// We need to create public methods to perform required actions on each
	// webElement we stored.

	public void enterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}

	public boolean iphoneImageIsDisplayed() {
		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean macbookImageIsDisplayed() {
		if (macbookImage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean appleCinemaImageIsDisplayed() {
		if (appleCinemaImage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean canonImageIsDisplayed() {
		if (canonImage.isDisplayed())
			return true;
		else
			return false;
	}

	// We need to create methods to perform on each WebElement.

	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(registerOption);
	}

	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);
	}

	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);
	}

	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterTelephone(String phoneNumber) {
		WebDriverUtility.enterValue(telephoneField, phoneNumber);
	}

	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
	}

	public void subscribe(String valueOfSubscribe) {
		if (valueOfSubscribe.equalsIgnoreCase("yes")) {

			if (!yesSubscribeButton.isSelected())
				WebDriverUtility.clickOnElement(yesSubscribeButton);
		} else
			WebDriverUtility.clickOnElement(noSubscribeButton);
	}

	public void checkPrivacyPolicy() {
		if (privacyPolicyCheckBox.isDisplayed())
			;
		{
			privacyPolicyCheckBox.click();
		}

	}

	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}

	public boolean registrationOutcome() {
		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
	}
}
