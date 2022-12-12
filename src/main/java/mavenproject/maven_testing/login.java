package mavenproject.maven_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pom.BasicClass;

public class login {
	 static WebDriver driver;
	@BeforeTest
	public  void tetsRgister() {
		BasicClass BC = new BasicClass();
		BasicClass.LaunchBrowser();
		driver = BasicClass.getWebDriver();
	}

}