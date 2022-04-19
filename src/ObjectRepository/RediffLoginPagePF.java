package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(xpath = "//input[@name='proceed']")
	WebElement signIn;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(linkText = "rediff.com")
	WebElement home;

	public RediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getHome() {
		return home;
	}
}
