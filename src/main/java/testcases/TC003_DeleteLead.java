package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_DeleteLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="DeleteLead(Positive)";
		testDescription="Delete existing lead";
		browserName="chrome";
		dataSheetName="TC003_DeleteLead";
		category="Smoke";
		authors="Barath";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String phoneNumber,String id){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCrmsfa()
		.clickLeadsLink()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadButton()
		.captureLeadId()
		.clickFirstResulingLead()
		.clickDeleteButton()
		.clickFindLead()
		.enterLeadId(id)
		.clickFindLeadButton();
		

	}
}

