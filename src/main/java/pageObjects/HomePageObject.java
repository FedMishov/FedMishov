package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//img[@alt='iPhone 6'])[2]")
	private WebElement iphone6MobilElement;
	@FindBy(xpath = "(//img[@alt=MacBookAir'])[2]")
	private WebElement macbookAirImage;
	@FindBy(xpath = "//impurt[@name=search']")
	private WebElement headerButtonPrive;
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macbookImage;
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[1]")
	private WebElement headerSwipButtonNext;

	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement iponAddToWishlist;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement iphoneAddtoCart;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphoneText;
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPoneImage;
	@FindBy(xpath = "//button[@type='button'])[9]")
	private WebElement macBookComparethisProduct;
	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement macBookToWishList;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement macBookAddToCart;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookText;
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[3]")
	private WebElement  compareAppleCinema30Product;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]")
	private WebElement compareMacBookProduct;
}
