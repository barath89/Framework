package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers  {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not My Home Page", "FAIL");
		}
	}

	// Click Create Lead  
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);
	}

	//Click Leads Link
	public MyLeadsPage clickLeadsLink(){
		clickByLink("Leads");
		return new MyLeadsPage(driver, test);
	}
	
	

	// Click Create Contact  
		public CreateContactPage clickCreateContact(){
			clickByLink("Create Contact");
			return new CreateContactPage(driver, test);
		}

}
