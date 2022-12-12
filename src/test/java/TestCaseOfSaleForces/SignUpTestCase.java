package TestCaseOfSaleForces;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import ResourcesOfTest.BaseClass;
import ResourcesOfTest.ConstantData;
import ResourcesOfTest.commonMethods;

public class SignUpTestCase extends BaseClass {
	@Test
	public void SignUpPage() throws IOException, InterruptedException {
		
		LoginPageObject lpo= new LoginPageObject(driver);
		Thread.sleep(7000);
		lpo.TryForFree().click();
		
		SignUpPageObject spo=new SignUpPageObject(driver);
		
		spo.EnterFirstName().sendKeys(ConstantData.FirstNAme);
		spo.EnterLastName().sendKeys(ConstantData.LastName);
		spo.EnterUserEmail().sendKeys(ConstantData.UserEmail);
		spo.EnterUserPhone().sendKeys(ConstantData.UserPhone);
		spo.EnterCompanyName().sendKeys(ConstantData.CompanyName);
		
		/*
				Select s=new Select(spo.SelectCompanyEmployees());
		s.selectByIndex(1);
		Thread.sleep(2000);
		Select s2=new Select(spo.SelectUserTitle());
		s2.selectByIndex(1);
		Thread.sleep(2000);
		Select s1=new Select(spo.SelectCompanyCountry());
		s1.selectByVisibleText("Singapore");
		Thread.sleep(5000);
		Select s3=new Select(spo.SelectCompanyState());
		s3.selectByIndex(1);
		spo.ClickOnCheckBox().click();
		spo.ClickOnStartMyFreeTrial().click();
		
		*/
		commonMethods.SelectDropdownByIndex(spo.SelectUserTitle(), 2);
		commonMethods.SelectDropdownByIndex(spo.SelectCompanyEmployees(), 1);
		Thread.sleep(3000);
		commonMethods.SelectDropdownByText(spo.SelectCompanyCountry(),"Singapore");
		Thread.sleep(3000);
		commonMethods.SelectDropdownByIndex(spo.SelectCompanyState(), 1);
		spo.ClickOnCheckBox().click();
		Thread.sleep(2000);
		spo.ClickOnStartMyFreeTrial().click();
		
		
		
	}
	
	

}
