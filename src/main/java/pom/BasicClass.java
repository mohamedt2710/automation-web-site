package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);         

	}

	public static WebDriver getWebDriver() {
		return driver;
	}
}
