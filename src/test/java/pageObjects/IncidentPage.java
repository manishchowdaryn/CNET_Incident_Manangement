package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class IncidentPage {

	public BaseUtil base;

	public IncidentPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='incident.subcategory']")
	public WebElement subCategory;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup.incident.business_service']")
	public WebElement businessServiceLookUp;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup.incident.cmdb_ci']")
	public WebElement configurationItem;

	@FindBy(how = How.XPATH, using = "//*[@id='incident.impact']")
	public WebElement impact;

	@FindBy(how = How.XPATH, using = "//*[@id='incident.urgency']")
	public WebElement urgency;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup.incident.assignment_group']")
	public WebElement assignmentGroup;

	@FindBy(how = How.XPATH, using = "//*[@placeholder='Search' and @class='form-control']")
	public WebElement searchButton;
		
	@FindBy(how = How.XPATH, using = "//*[@id='lookup.incident.assigned_to']")
	public WebElement assignedTo;

	@FindBy(how = How.XPATH, using = "//*[@id='incident.short_description']")
	public WebElement shortDescription;

	@FindBy(how = How.XPATH, using = "//*[@id='sysverb_insert']")
	public WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//*[@class='list2_body']/tr[1]/td[7]")
	public WebElement priorityVerify;

	@FindBy(how = How.XPATH, using = "//*[@class='list2_body']/tr[1]/td[8]")
	public WebElement stateVerify;

	@FindBy(how = How.XPATH, using = "//*[@class='list2_body']/tr[1]/td[10]")
	public WebElement assignmentGroupVerify;

	@FindBy(how = How.XPATH, using = "//*[@class='list2_body']/tr[1]/td[11]")
	public WebElement assignedToVerify;
	
	@FindBy(how = How.XPATH, using = "//*[@class='list2_body']/tr[1]/td[3]")
	public WebElement selectIncident;

	////*[@id='tabs2_section']/span[4]/span/span[2]
	@FindBy(how = How.XPATH, using = "//*[@id='tabs2_section']/span[5]/span[1]/span[2]")
	public WebElement majorIncident;	
	
	@FindBy(how = How.XPATH, using = "//*[@id='incident.state']")
	public WebElement incidentState;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup.incident.caller_id']")
	public WebElement caller;
		
	@FindBy(how = How.XPATH, using = "//*[@id='resolve_incident']")
	public WebElement resolveButton;

	
	@FindBy(how = How.XPATH, using = "//*[@id='tabs2_section']/span[3]/span/span[2]")
	public WebElement resolutionInformation;

	@FindBy(how = How.XPATH, using = "//*[@id='incident.close_code']")
	public WebElement resolutionCode;

	@FindBy(how = How.XPATH, using = "//*[@id='incident.close_notes']")
	public WebElement resolutionNote;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup.incident.problem_id']")
	public WebElement problemLookUp;

	@FindBy(how = How.XPATH, using = "//*[@id='close_incident']")
	public WebElement closeIncident;

	public WebElement subCategory() {
		return subCategory;
	}

	public WebElement businessServiceLookUp() {
		return businessServiceLookUp;
	}

	public WebElement configurationItem() {
		return configurationItem;
	}

	public WebElement impact() {
		return impact;
	}

	public WebElement urgency() {
		return urgency;
	}

	public WebElement assignmentGroup() {
		return assignmentGroup;
	}
	
	public WebElement searchButton() {
		return searchButton;
	}
	

	public WebElement assignedTo() {
		return assignedTo;
	}

	public WebElement shortDescription() {
		return shortDescription;
	}

	public WebElement submitButton() {
		return submitButton;
	}
	
	public WebElement priorityVerify() {
		return priorityVerify;
	}

	public WebElement stateVerify() {
		return stateVerify;
	}
	
	public WebElement assignmentGroupVerify() {
		return assignmentGroupVerify;
	}
	
	public WebElement assignedToVerify() {
		return assignedToVerify;
	}
	
	public WebElement selectIncident() {
		return selectIncident;
	}

	public WebElement resolveButton() {
		return resolveButton;
	}

	public WebElement majorIncident() {
		return majorIncident;
	}
	
	public WebElement incidentState() {
		return incidentState;
	}
	
	public WebElement resolutionInformation() {
		return resolutionInformation;
	}

	public WebElement resolutionCode() {
		return resolutionCode;
	}

	public WebElement resolutionNote() {
		return resolutionNote;
	}

	public WebElement problemLookUp() {
		return problemLookUp;
	}

	public WebElement closeIncident() {
		return closeIncident;
	}
	
	public WebElement caller() {
		return caller;
	}
	
	

	
}
