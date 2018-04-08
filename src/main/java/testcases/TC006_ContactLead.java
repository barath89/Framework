package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_ContactLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="CreateContact(Positive)";
		testDescription="Create new Contact";
		browserName="chrome";
		dataSheetName="TC006_CreateContact";
		category="Smoke";
		authors="Barath";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String firstName,String lastName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCrmsfa()
	
		.clickCreateContact()
		.enterFirstName(firstName)
		.enterlastName(lastName)
		.clickCreateContactButton();
		
		
		
		
		


	}
}

