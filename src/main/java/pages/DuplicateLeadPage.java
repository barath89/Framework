package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers  {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not view Duplicate Page", "FAIL");
		}
	}

	// Click Create Lead 
	public ViewLeadPage clickCreateLeadButton(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
	}

	public DuplicateLeadPage verifyDuplicateLeadTitle(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Duplicate Lead Page", "FAIL");
		}
		return this;
	}
	
	
	
	
}
















