package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopObj extends Base {

	// Once we created the DesktopPageObj class, we need to extend it to the Base
	// class to use the Parent class properties such as WebDirver
	// Then we create a constructor inside which we define our
	// PageFactory.initElements
	// method to initialize the WebElement in this page.

	public DesktopObj() {
		PageFactory.initElements(driver, this);

	}

	// We need to store User Interface (UI) WebElements in a private WebElemen
	// using @FindBy annotation of PageFactory class.

	@FindBy(xpath = "(//a[@class = 'dropdown-toggle'])[2]")
	private WebElement desktopDropdown;

	@FindBy(xpath = "//a[contains(text(),'PC (0)')]")
	private WebElement pcOption;

	@FindBy(xpath = "//h2[contains(text(),'PC')]")
	private WebElement pcSearchResultMessage;

	@FindBy(xpath = "//a[contains(text(),'Mac (1)')]")
	private WebElement macOption;

	@FindBy(xpath = "//img[@ title = 'iMac']")
	private WebElement imacImage;

	@FindBy(xpath = "//h2[contains(text(),'Mac')]")
	private WebElement macMessage;

	@FindBy(xpath = "//button[@id = 'list-view']")
	private WebElement listViewButton;

	@FindBy(xpath = "//button[@id = 'grid-view']")
	private WebElement gridViewButton;

	@FindBy(xpath = "//a[@id = 'compare-total']")
	private WebElement productCompareLink;

	@FindBy(xpath = "//select[@id = 'input-sort']")
	private WebElement inputSortDropDown;

	@FindBy(xpath = "//select[@id = 'input-limit']")
	private WebElement inputLimitDropdown;

	@FindBy(xpath = "//a[contains(text(),'iMac')]")
	private WebElement imacMessage;

	@FindBy(xpath = "//button[@xpath = '1']")
	private WebElement addToCartButton;

	@FindBy(xpath = "(//button[@ data-toggle = 'tooltip'])[3]")
	private WebElement addToWishListButton;

	@FindBy(xpath = "//button[@ data-original-title = 'Compare this Product']")
	private WebElement compareThisProductButton;

	@FindBy(xpath = "(//img[@title = 'iMac'])[2]")
	private WebElement imacImage2;

	@FindBy(xpath = "(//img[@title = 'iMac'])[3]")
	private WebElement imacImage3;

	@FindBy(xpath = "(//a[@data-toggle = 'tab'])[1]")
	private WebElement descriptionTab;

	@FindBy(xpath = "(//a[@data-toggle = 'tab'])[2]")
	private WebElement reviewTab;

	@FindBy(xpath = "(//i[@class = 'fa fa-heart'])[2]")
	private WebElement addToWishListButton2;

}
