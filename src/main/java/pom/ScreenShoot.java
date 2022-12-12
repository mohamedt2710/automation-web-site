package pom;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.io.FileHandler;

public class ScreenShoot {
	public void testScreenShot(WebDriver result, String screen) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) result;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("screen"));
	}

	public void filedScreen(ITestResult t_result) throws IOException {
		if (t_result.getStatus() == ITestResult.FAILURE) {
			testScreenShot(BasicClass.getWebDriver(), "G:\\screen" + t_result.getName() + ".png");
		}

	}

	public void filed__Screen(ITestResult t_result) throws IOException {
		if (t_result.getStatus() == ITestResult.FAILURE) {
			ScreenShoot x = new ScreenShoot();
			x.testScreenShot(BasicClass.getWebDriver(), "G:\\screen" + t_result.getName() + ".png");
		}

	}

	public void ks() {
		File screenshot = ((TakesScreenshot) BasicClass.getWebDriver()).getScreenshotAs(OutputType.FILE);

		// Copy the file to a location and use try catch block to handle exception
		try {
			FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterMethod
	public void tackescreen(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot ts = (TakesScreenshot) BasicClass.getWebDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			fileUtils.copyFile(source, new File("" + result.getName() + ".png"));
		}

	}

}
