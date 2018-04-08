package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers  {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not My Leads Page", "FAIL");
		}
	}
	
	// Click Create Lead  
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);
	}

	// Click Find Leads Link (Left ToolBar)  
		public FindLeadsPage clickFindLead(){
			clickByLink("Find Leads");
			return new FindLeadsPage(driver, test);
		}

		//Click Merge Lead
		public MergeLeadPage clickMergeLead(){
			clickByLink("Merge Leads");
			return new  MergeLeadPage(driver,test);
			
		}
	
}
