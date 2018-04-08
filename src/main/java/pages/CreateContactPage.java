package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateContactPage extends LeafTapsWrappers  {

	public CreateContactPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Contact | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}
	
	//Enter First name 
	
	public CreateContactPage  enterFirstName(String firstName){
		enterById("firstNameField",firstName);
		return new  CreateContactPage(driver,test);
	}
	
	// Enter Last Name
	
	public CreateContactPage  enterlastName(String lastName){
		enterById("lastNameField",lastName);
		return new  CreateContactPage(driver,test);
	}
	
	// Click Create Contact
	
	public ViewContactPage clickCreateContactButton(){
		clickByName("submitButton");
		return new ViewContactPage(driver, test);

	}
	
	/*// Enter Company Name
	public CreateContactPage enterCompanyName(String companyName){
		enterById("createLeadForm_companyName", companyName);
		return this;
	}

	// Enter First Name
	public CreateContactPage enterFirstName(String firstName){
		enterById("createLeadForm_firstName", firstName);
		return this;
	}

	// Enter Last Name
	public CreateContactPage enterLastName(String lastName){
		enterById("createLeadForm_lastName", lastName);
		return this;
	}

	// Enter Source
	public CreateContactPage enterSource(String source){
		selectVisibileTextById("createLeadForm_dataSourceId", source);
		return this;
	}

	//Enter Marketing Campaign
	public CreateContactPage enterMarketingCampaign(String campaign){
		selectVisibileTextById("createLeadForm_marketingCampaignId", campaign);
		return this;
	}

	// Enter Phone Number
	public CreateContactPage enterPhoneNumber(String phoneNumber ){
		enterById("createLeadForm_primaryPhoneNumber", phoneNumber);
		return this;
	}

	// Enter Email
	public CreateContactPage enterEmail(String email ){
		enterById("createLeadForm_primaryEmail", email);
		return this;
	}

	// Click Create Lead 
	public ViewLeadPage clickCreateLeadButton(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);

	}*/
}
