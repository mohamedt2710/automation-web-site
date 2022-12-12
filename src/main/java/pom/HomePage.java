package pom;

import org.openqa.selenium.By;

public class HomePage {
	
	public void ClickOnSignin() {
		BasicClass.getWebDriver().findElement(By.className("login")).click();
	}

}
 