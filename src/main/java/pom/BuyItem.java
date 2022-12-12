package pom;

import org.openqa.selenium.By;

public class BuyItem {
	public void buyItem() throws InterruptedException {
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/a/img"))
				.click();
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();

		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();

	}

	public void cc() {
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
	}

	public void c() {
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		BasicClass.getWebDriver().findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();

	}

}
