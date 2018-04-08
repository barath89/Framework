package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_MergeLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="MergeLead(Positive)";
		testDescription="Mearge Existing leads";
		browserName="chrome";
		dataSheetName="TC004_MergeLead";
		category="Smoke";
		authors="Barath";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String leadId,String leadId1) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCrmsfa()
		.clickLeadsLink()
		.clickMergeLead()
		.clickFromLead()
		.enterLeadId(leadId)
		.clickFindLeadButton()
		.clickFirstResulingLead()
		.clickToLead()
		.enterLeadId(leadId1)
		.clickFirstResulingLead()
		.clickMergeLead()
		.clickFindLeadLink()
		.enterLeadId(leadId1)
		.clickFindLeadButton()
		.verifyErrorMessage();








	}







}


