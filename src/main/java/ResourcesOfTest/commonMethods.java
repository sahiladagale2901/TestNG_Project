package ResourcesOfTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void SelectDropdownByIndex(WebElement dropdown, int index) {

		Select s = new Select(dropdown);
		s.selectByIndex(index);
	}

	public static void SelectDropdownByText(WebElement dropdown, String text) {

		Select s = new Select(dropdown);

		s.selectByVisibleText(text);
	}
	
	public static void Assertion(String ActualError, String ExpectedError ) {
		SoftAssert assertion=new SoftAssert();
		
		//String Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String Actual=ActualError;
		String Expected=ExpectedError;
		
		assertion.assertEquals(Actual, Expected);
		
		assertion.assertAll();
	}

}
