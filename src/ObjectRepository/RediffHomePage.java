package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	public WebDriver driver;
	private By search = By.xpath("//input[@id='srchword']");
	private By submitSearch = By.xpath("//input[@aria-label='Search']");


	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearch() {
		return driver.findElement(search);
	}

	public WebElement getSubmitSearch() {
		return driver.findElement(submitSearch);
	}
}
