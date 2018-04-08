package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers  {

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead Page", "FAIL");
		}
	}

	// Click From Lead Image 
	public FindLeads clickFromLead(){
			
		clickByXpathNoSnap("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		return new FindLeads(driver, test);
	}

	// Click To Lead Image 
	public FindLeads clickToLead(){
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeads(driver, test);
	}

	// Click Merge Lead Button
	public ViewLeadPage clickMergeLead() throws InterruptedException{
		clickByLinkNoSnap("Merge");
		acceptAlert();
		Thread.sleep(5000);
		return new ViewLeadPage(driver, test);
	}
	

	//Accept Alert Message

	public ViewLeadPage handlePrompt() throws InterruptedException{
		acceptAlert();
		Thread.sleep(5000);
		return new ViewLeadPage(driver, test);
	}

	
	
}

























	

