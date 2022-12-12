package pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class InvalidMail {
	public void invalidmail()  {
		BasicClass.getWebDriver().findElement(By.id("email_create")).sendKeys("tes,tgmail.com");
		BasicClass.getWebDriver().findElement(By.id("SubmitCreate")).click();
		String invalid = BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li"))
				.getText();
		assertEquals(invalid, "Invalid email address.");
	}
	public void validmail() {
		BasicClass.getWebDriver().findElement(By.id("email_create")).clear();
		BasicClass.getWebDriver().findElement(By.id("email_create")).sendKeys("MTantawy@gmail.com");
		BasicClass.getWebDriver().findElement(By.id("SubmitCreate")).click();

	}
}
