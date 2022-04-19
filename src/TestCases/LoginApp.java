package TestCases;


import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApp {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rediffLoginPage = new RediffLoginPage(driver);
		rediffLoginPage.getEmail().sendKeys("username");
		rediffLoginPage.getPassword().sendKeys("password");
		rediffLoginPage.getSignIn().click();
		rediffLoginPage.getHome().click();

		RediffHomePage rediffHomePage = new RediffHomePage(driver);
		rediffHomePage.getSearch().sendKeys("search");
		rediffHomePage.getSubmitSearch().click();

		driver.quit();
	}
}
