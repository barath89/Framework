package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers  {

	public static String leadid;
	public static String leadname;


	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;


		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find lead Page", "FAIL");
		}
	}
	// Enter First Name
	public FindLeadsPage enterfirstName(String firstName){
		enterByXpath("(//input[@name='firstName'])[3]",firstName );
		return this;
	}

	// Click Find Leads Button
	public FindLeadsPage clickFindLeadButton(){
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}

	// Click First Resulting Lead

	public ViewLeadPage clickFirstResulingLead(){
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		return new ViewLeadPage(driver,test);
	}

	//Click Phone Tab
	public FindLeadsPage clickPhoneTab(){
		clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
		return this;
	}

	//Enter Phone Number
	public FindLeadsPage enterPhoneNumber(String phoneNumber){
		enterByXpath("(//input[@name='phoneNumber'])", phoneNumber);
		return this;
	}

	//Enter Email Tab
	public FindLeadsPage clickEmailTab(){
		clickByXpath("(//span[@class='x-tab-strip-text '])[3]");
		return this;
	}

	//Enter EmailId
	public FindLeadsPage enterEmailID(String emailid){
		enterByName("emailAddress", emailid);
		return this;
	}


	//Get LeadID
	public FindLeadsPage captureLeadId(){
		leadid = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(leadid);
		return this;
	}

	//Set LeadID
	public FindLeadsPage enterLeadId(String id){
		System.out.println(leadid);
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",leadid);
		return this;
	}

	//Verify Error Message
	public FindLeadsPage verifyErrorMessage(){
		verifyTextByXpath("//div[contains(text(),'No records to display')]","No records to display");
		return this;
	}

	//Get Lead Name
	public FindLeadsPage captureLeadName(){
		leadname = getTextByXpath("( //div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
		System.out.println(leadname);
		return this;
	}

	
	/*public FindLeads LastWindowHandle(){
		switchToLastWindow();
		return new FindLeads(driver, test) ;
	}*/
}
