package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="CreateLead(Positive)";
		testDescription="Create new Lead";
		browserName="chrome";
		dataSheetName="TC001_CreateLead";
		category="Smoke";
		authors="Barath";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String companyName,String firstName,String lastName,String source,String campaign,String phoneNumber,String email ){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCrmsfa()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterSource(source)
		.enterMarketingCampaign(campaign)
		.enterPhoneNumber(phoneNumber)
		.enterEmail(email)
		.clickCreateLeadButton()
		.verifyLead(firstName);
		
		
		
		


	}
}

