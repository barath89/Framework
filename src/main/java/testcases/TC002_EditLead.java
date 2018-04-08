package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="EditLead(Positive)";
		testDescription="Edit Leads Company Name ";
		browserName="chrome";
		dataSheetName="TC002_EditLead";
		category="Smoke";
		authors="Barath";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String firstName,String companyNameUpdated){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCrmsfa()
		.clickLeadsLink()
		.clickFindLead()
		.enterfirstName(firstName)
		.clickFindLeadButton()
		.clickFirstResulingLead()
		.clickEditButton()
		.upadateCompanyName(companyNameUpdated)
		.clickUpdateButton();
		
	}
}

