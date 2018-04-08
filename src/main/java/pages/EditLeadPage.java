package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not view Lead Page", "FAIL");
		}
	}


	//Update Company Name
	public EditLeadPage upadateCompanyName(String companyName){
		enterById("updateLeadForm_companyName", companyName);
		return this;
	}
	
	// Click Update Button 
	public ViewLeadPage clickUpdateButton(){
		clickByXpath("(//input[@type='submit'])[1]");
		return new ViewLeadPage(driver,test);
		
	}
/*//
	public EditLeadPage verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}*/
























}
