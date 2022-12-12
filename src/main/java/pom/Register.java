package pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public void Registernewmail() {
		ChooseGender();
		Faild_FirstName();
		Faild_LastName();
		Faild_passwd();
		newsletter();
		ChooseBirthDate();
		Faild_company();
		Faild_Adress();
		Faild_city();
		Faild_postcode();
		ChooseState();
		Faild_other();
		Faild_home_phone();
		Faild_phone_mobile();
		ClilkRegister();
	}

	public void ChooseBirthDate() {
		Select day = new Select(BasicClass.getWebDriver().findElement(By.name("days")));

		day.selectByIndex(25); // new
		day.getFirstSelectedOption().getText();

		Select month = new Select(BasicClass.getWebDriver().findElement(By.name("months")));
		month.selectByIndex(5); // new
		month.getFirstSelectedOption().getText();

		Select year = new Select(BasicClass.getWebDriver().findElement(By.name("years")));
		year.selectByIndex(10); //
		year.getFirstSelectedOption().getText();

	}

	public void ChooseState() {
		Select state = new Select(BasicClass.getWebDriver().findElement(By.name("id_state")));
		assertFalse(state.isMultiple());
		state.selectByVisibleText("Florida"); // new
		assertEquals("Florida", state.getFirstSelectedOption().getText());

	}

	public void ChooseGender() {
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
	}

	public void Faild_FirstName() {
		BasicClass.getWebDriver().findElement(By.id("customer_firstname")).sendKeys("Mohamed");

	}

	public void Faild_LastName() {
		BasicClass.getWebDriver().findElement(By.id("customer_lastname")).sendKeys("Tanatwy");

	}

	public void Faild_passwd() {
		BasicClass.getWebDriver().findElement(By.id("passwd")).sendKeys("123456456");

	}

	public void newsletter() {
		BasicClass.getWebDriver().findElement(By.id("newsletter")).click();
		BasicClass.getWebDriver().findElement(By.id("optin")).click();

	}

	public void Faild_company() {
		BasicClass.getWebDriver().findElement(By.id("company")).sendKeys("Acu");

	}

	public void Faild_Adress() {
		BasicClass.getWebDriver().findElement(By.id("address1")).sendKeys("6th Of October");

	}

	public void Faild_city() {
		BasicClass.getWebDriver().findElement(By.id("city")).sendKeys("Giza");

	}

	public void Faild_postcode() {
		BasicClass.getWebDriver().findElement(By.id("postcode")).sendKeys("11111");
	}

	public void Faild_other() {
		BasicClass.getWebDriver().findElement(By.id("other")).sendKeys("QA");

	}

	public void Faild_home_phone() {
		BasicClass.getWebDriver().findElement(By.id("phone")).sendKeys("02421432529	");

	}

	public void Faild_phone_mobile() {
		BasicClass.getWebDriver().findElement(By.id("phone_mobile")).sendKeys("01026860184");

	}

	public void ClilkRegister() {
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	}

}
