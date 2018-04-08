package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewContactPage extends LeafTapsWrappers  {

	public ViewContactPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Contact | opentaps CRM")){
			reportStep("This is not view Lead Page", "FAIL");
		}
	}

	// Verify the First Name
	public ViewContactPage verifyLead(String firstName){
		verifyTextById("viewLead_firstName_sp", firstName);
		return this;
	}

	// Verify the Company Name
	public ViewContactPage verifyCompanyName(String companyName){
		verifyTextById("viewLead_companyName_sp", companyName);
		return this;
	}

	//Click Edit Lead Button
	public EditLeadPage clickEditButton(){
		clickByLink("Edit");
		return new EditLeadPage(driver,test);

	}

	//Click Delete Button
	public MyLeadsPage clickDeleteButton(){
		clickByClassName("subMenuButtonDangerous");;
		return new MyLeadsPage(driver,test);

	}


	// Click find Leads
	public FindLeadsPage clickFindLeadLink(){
		clickByLink("Find Leads");
		return new FindLeadsPage(driver, test);
	}

	//Click Duplicate Lead Button
	public DuplicateLeadPage clickDuplicateButton(){
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver,test);

	}

	public ViewContactPage confirmDuplicateLead() {
		verifyTextById("viewLead_firstName_sp",FindLeadsPage.leadname);
		return this;
	}













}
