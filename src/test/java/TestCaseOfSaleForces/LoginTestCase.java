package TestCaseOfSaleForces;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import ResourcesOfTest.BaseClass;
import ResourcesOfTest.ConstantData;
import ResourcesOfTest.commonMethods;

public class LoginTestCase extends BaseClass {
	@Test
	public void loginPage() throws IOException, InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.EnterUsername().sendKeys(ConstantData.username);
		lpo.EnterPassword().sendKeys(ConstantData.password);
		lpo.LoginButtonClick().click();

		/*
		 * SoftAssert assertion=new SoftAssert(); String
		 * Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator."
		 * ; assertion.assertEquals(lpo.ActualError().getText(), Expected);
		 *  assertion.assertAll();
		 */
		commonMethods.Assertion(lpo.ActualError().getText(), ConstantData.Expected);
		////////////// text check= Forgot Your Password? /////////////////
		commonMethods.Assertion(lpo.ForgotPasswordText().getText(), ConstantData.ForgotPasswordText);
		
		//Thread.sleep(3000);
		//lpo.TryForFree().click();
	
	}

}
