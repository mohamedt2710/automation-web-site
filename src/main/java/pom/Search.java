package pom;

import org.openqa.selenium.By;

public class Search {
	public void Searchs() {
		BasicClass.getWebDriver().findElement(By.id("search_query_top")).sendKeys("t-shirt");
		BasicClass.getWebDriver().findElement(By.name("submit_search")).click();
	}


}
