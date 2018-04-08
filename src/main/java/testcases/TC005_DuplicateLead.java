package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_DuplicateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Duplicate lead(Positive)";
		testDescription="Duplicating the existing lead";
		browserName="chrome";
		dataSheetName="TC005_DuplicateLead";
		category="Smoke";
		authors="Barath";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String emailId){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCrmsfa()
		.clickLeadsLink()
		.clickFindLead()
		.clickEmailTab()
		.enterEmailID(emailId)
		.clickFindLeadButton()
		.captureLeadName()
		.clickFirstResulingLead()
		.clickDuplicateButton()
		.verifyDuplicateLeadTitle(driver, test)
		.clickCreateLeadButton()
		.confirmDuplicateLead();

	}
}


