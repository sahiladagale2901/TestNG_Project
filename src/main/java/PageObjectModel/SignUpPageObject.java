package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;

	public SignUpPageObject(WebDriver driver) {
		this.driver = driver;
	}

	private By FirstName = By.xpath("//input[@name='UserFirstName']");
	private By LastName = By.xpath("//input[@name='UserLastName']");
	private By UserEmail = By.xpath("//input[@name='UserEmail']");
	private By CompanyName = By.xpath("//input[@name='CompanyName']");
	private By UserPhone = By.xpath("//input[@name='UserPhone']");
	private By CompanyEmployees = By.xpath("//select[@name='CompanyEmployees']");
	private By UserTitle = By.xpath("//select[@name='UserTitle']");
	private By CompanyCountry = By.xpath("//select[@name='CompanyCountry']");
	private By CompanyState = By.xpath("//select[@name='CompanyState']");
	
	private By StartMyFreeTrial = By.xpath("//button[@name='start my free trial']");
	private By ClickOnCheckBox = By.xpath("//div[@class='checkbox-ui']");
	
	public WebElement EnterFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement EnterLastName() {
		return driver.findElement(LastName);
	}

	public WebElement EnterUserEmail() {
		return driver.findElement(UserEmail);
	}

	public WebElement EnterCompanyName() {
		return driver.findElement(CompanyName);
	}

	public WebElement EnterUserPhone() {
		return driver.findElement(UserPhone);
	}

	public WebElement SelectCompanyEmployees() {
		return driver.findElement(CompanyEmployees);
	}

	public WebElement SelectUserTitle() {
		return driver.findElement(UserTitle);
	}

	public WebElement SelectCompanyCountry() {
		return driver.findElement(CompanyCountry);
	}

	public WebElement SelectCompanyState() {
		return driver.findElement(CompanyState);
	}
	
	public WebElement ClickOnCheckBox() {
		return driver.findElement(ClickOnCheckBox);
	}
	public WebElement ClickOnStartMyFreeTrial() {
		return driver.findElement(StartMyFreeTrial);
	}

}
