package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeads extends LeafTapsWrappers  {
public static String leadid;
	
	public FindLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;


		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Lead pop-up Page", "FAIL");
		}
	}
	// Enter First Name
	public FindLeads enterfirstName(String firstName){
		enterByXpath("(//input[@name='firstName'])[3]",firstName );
		return this;
	}

	// Click Find Leads Button
	public FindLeads clickFindLeadButton(){
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}

	// Click First Resulting Lead

	public MergeLeadPage clickFirstResulingLead(){
	
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		//System.out.println("in find leads");
		return new MergeLeadPage(driver, test);
	}

	public FindLeads clickPhoneTab(){
		clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
		return this;
	}

	public FindLeads enterPhoneNumber(String phoneNumber){
		enterByXpath("(//input[@name='phoneNumber'])", phoneNumber);
		return this;
	}

	public FindLeads captureLeadId(){
		getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		return this;

	}

	public FindLeads enterLeadId(String leadId){
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", leadId);
		return this;
	}

	

















}
