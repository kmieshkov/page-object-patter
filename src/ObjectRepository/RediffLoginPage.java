package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	public WebDriver driver;
	private By username = By.xpath("//input[@id='login1']");
	private By password = By.xpath("//input[@id='password']");
	private By signIn = By.xpath("//input[@name='proceed']");
	private By home = By.linkText("rediff.com");

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(username);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}

	public WebElement getHome() {
		return driver.findElement(home);
	}
}
