package ResourcesOfTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;

	public void browserlaunch() throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\ResourcesOfTest\\browser.properties";
		// String
		// path="C:\\Users\\sahil\\eclipse-workspace\\SalesForceHandleProject\\src\\main\\java\\ResourcesOfTest\\browser.properties";
		FileInputStream file = new FileInputStream(path);

		Properties prop = new Properties();
		prop.load(file);

		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("check the browser name");
		}
	}

	@BeforeMethod
	public void launch() throws IOException {
		browserlaunch();
		driver.get("https://login.salesforce.com/?locale=in");
	}

	@AfterSuite
	public void quit() {
		driver.quit();
	}

}
