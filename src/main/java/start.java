import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.BasicClass;
import pom.BuyItem;
import pom.HomePage;
import pom.InvalidMail;
import pom.Register;
import pom.Search;

@Test
public class start {
	static WebDriver driver;

	@BeforeTest
	public void Start() {
		BasicClass.LaunchBrowser();
		driver = BasicClass.getWebDriver();
	}

	@Test(priority = 1)
	public void Signin() {
		HomePage signin = new HomePage();
		signin.ClickOnSignin();
	}

	@Test(priority = 2)
	public void valid() {
		InvalidMail valid = new InvalidMail();
		valid.invalidmail();

	}

	@Test(priority = 3)
	public static void Regiset() throws InterruptedException, IOException {
		InvalidMail valid = new InvalidMail();
		valid.validmail();
		Register Register = new Register();
		Register.Registernewmail();
		// Register RG = new Register();
		// RG.Registernewmail();

	}

	@Test(priority = 4)
	public void search() {
		Search Search = new Search();
		Search.Searchs();
	}

	@Test(priority = 5)
	public static void buyitem() throws InterruptedException, IOException {
		BuyItem buyItem = new BuyItem();
		buyItem.buyItem();
		buyItem.cc();
		buyItem.c();

	}

	@AfterTest
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
