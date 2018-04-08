package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers  {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}
	// Enter Company Name
	public CreateLeadPage enterCompanyName(String companyName){
		enterById("createLeadForm_companyName", companyName);
		return this;
	}

	// Enter First Name
	public CreateLeadPage enterFirstName(String firstName){
		enterById("createLeadForm_firstName", firstName);
		return this;
	}

	// Enter Last Name
	public CreateLeadPage enterLastName(String lastName){
		enterById("createLeadForm_lastName", lastName);
		return this;
	}

	// Enter Source
	public CreateLeadPage enterSource(String source){
		selectVisibileTextById("createLeadForm_dataSourceId", source);
		return this;
	}

	//Enter Marketing Campaign
	public CreateLeadPage enterMarketingCampaign(String campaign){
		selectVisibileTextById("createLeadForm_marketingCampaignId", campaign);
		return this;
	}

	// Enter Phone Number
	public CreateLeadPage enterPhoneNumber(String phoneNumber ){
		enterById("createLeadForm_primaryPhoneNumber", phoneNumber);
		return this;
	}

	// Enter Email
	public CreateLeadPage enterEmail(String email ){
		enterById("createLeadForm_primaryEmail", email);
		return this;
	}

	// Click Create Lead 
	public ViewLeadPage clickCreateLeadButton(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);

	}
}
