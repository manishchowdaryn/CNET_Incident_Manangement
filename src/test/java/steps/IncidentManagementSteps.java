package steps;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import baseClass.BaseUtil;
import cucumber.api.java.en.Then;
import gherkin.deps.net.iharder.Base64.InputStream;
import pageObjects.FilterNavigation;
import pageObjects.IncidentPage;
import pageObjects.Login;
import pageObjects.Logout;
import reusableFunction.Abstract;

public class IncidentManagementSteps extends BaseUtil {

	private static final Logger logger = Logger.getLogger(IncidentManagementSteps.class.getName());

	public BaseUtil base;
	public Login Login;
	public Logout Logout;
	public FilterNavigation FilterNavigation;
	public IncidentPage IncidentPage;
	public Abstract Abstract;
	static String folderName;
	static WebElement element;

	Properties prop = new Properties();
	InputStream input = null;

	public IncidentManagementSteps(BaseUtil base) {

		this.base = base;
		Login = new Login(base.driver);
		Logout = new Logout(base.driver);
		FilterNavigation = new FilterNavigation(base.driver);
		Abstract = new Abstract(base.driver);
		IncidentPage = new IncidentPage(base.driver);

	}

	@Then("^Verify whether Home page is correctly opened or not$")
	public void verify_whether_Home_page_is_correctly_opened_or_not() throws Throwable {

		// Thread.sleep(10000);
		String homePageTitle = base.driver.getTitle();
		assertEquals("Home page loading... | ServiceNow", homePageTitle);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("Display Homepage ");

	}

	@Then("^Enter Value in Filter Navigation Field Text Box \"([^\"]*)\"$")
	public void enter_Value_in_Filter_navigation_Field_Text_Box(String searchFilterValue) throws Throwable {

		WebElement searchFilter = Abstract.waitUntilConditionSatisfy(base, FilterNavigation.searchFilter());
		searchFilter.clear();
		searchFilter.sendKeys(searchFilterValue);
		Thread.sleep(15000);
		searchFilter.sendKeys(Keys.ENTER);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		searchFilter.sendKeys(Keys.ENTER);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("Enter value in filter navigation");

	}

	@Then("^Click on All Button$")
	public void click_On_Service_Catalog_Order_Guides_Link() throws Throwable {

		WebElement allButton = Abstract.waitUntilConditionSatisfy(base, FilterNavigation.allButton());
		allButton.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		allButton.click();
		base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click on All Button Link");

	}
//	@Then("^Click on New Button$")
//	public void clickOnNewButton() throws Throwable {
//
//		WebElement newButton = Abstract.waitUntilConditionSatisfy(base, FilterNavigation.newButton());
//		base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		newButton.click();
//		Abstract.checkPageIsReady(base);
//		newButton.click();
//		logger.info("Click on New Button");
//
//	}


	@Then("^Click on Create New Button$")
	public void clickOnNewButton() throws Throwable {

		WebElement createNewButton = Abstract.waitUntilConditionSatisfy(base, FilterNavigation.createNew());
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		createNewButton.click();
		logger.info("Click on Create New Button");
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}

	@Then("Select Sub Category Name as \"([^\"]*)\"$")
	public void subCategory(String subCategoryValue) throws IOException, AWTException, InterruptedException {
		WebElement subCategory = Abstract.waitUntilConditionSatisfy(base, IncidentPage.subCategory());
		Abstract.selectTheDropDownList(base, subCategory, subCategoryValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Select Sub Category Name as :" + subCategoryValue);
	}
	
	@Then("^Click On caller LookUP$")
	public void clickOnCaller() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement callerLookUp = Abstract.waitUntilConditionSatisfy(base,
				IncidentPage.caller());
		callerLookUp.click();
		Thread.sleep(3000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("Click On Caller LookUP");

	}


	@Then("^Click On Business Service LookUP$")
	public void clickOnBusinessService() throws Throwable {

		WebElement businessServiceLookUp = Abstract.waitUntilConditionSatisfy(base,
				IncidentPage.businessServiceLookUp());
		businessServiceLookUp.click();
		Thread.sleep(3000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click On Business Service LookUP");

	}

	@Then("^Click On Configuration Item LookUP$")
	public void configurationItem() throws Throwable {

		WebElement configurationItem = Abstract.waitUntilConditionSatisfy(base, IncidentPage.configurationItem());
		configurationItem.click();
		Thread.sleep(3000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click On Configuration Item LookUP");

	}

	@Then("Select Impact Name as \"([^\"]*)\"$")
	public void impactName(String impactValue) throws IOException, AWTException, InterruptedException {
		WebElement impact = Abstract.waitUntilConditionSatisfy(base, IncidentPage.impact());
		Abstract.selectTheDropDownList(base, impact, impactValue);
		Thread.sleep(3000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Select Type of impact as :" + impactValue);
	}

	@Then("Select urgency Name as \"([^\"]*)\"$")
	public void urgencyName(String urgencyValue) throws IOException, AWTException, InterruptedException {
		WebElement urgency = Abstract.waitUntilConditionSatisfy(base, IncidentPage.urgency());
		Abstract.selectTheDropDownList(base, urgency, urgencyValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Select Type of urgency Name as :" + urgencyValue);
	}

	@Then("^Click On Assigned Group LookUP$")
	public void clickOnAssigedGroup() throws Throwable {

		WebElement assignmentGroup = Abstract.waitUntilConditionSatisfy(base, IncidentPage.assignmentGroup());
		assignmentGroup.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click On Assignment Group LookUP");

	}

	@Then("^Click On Assigned To LookUP$")
	public void clickOnAssignedTo() throws Throwable {

		WebElement assignedTo = Abstract.waitUntilConditionSatisfy(base, IncidentPage.assignedTo());
		assignedTo.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click On Assignment TO LookUP");

	}

	@Then("^Enter short Description as \"([^\"]*)\"$")
	public void shortDescription(String shortDescriptionValue) throws Throwable {

		WebElement shortDescription = Abstract.waitUntilConditionSatisfy(base, IncidentPage.shortDescription());
		shortDescription.clear();
		shortDescription.sendKeys(shortDescriptionValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Enter Short Description");

	}

	@Then("^Click on Submit Button$")
	public void click_On_SubmitButton() throws Throwable {
		WebElement submitButton = Abstract.waitUntilConditionSatisfy(base, IncidentPage.submitButton());
		submitButton.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click on Submit Button");
	}

	@Then("^Validate Priority as \"([^\"]*)\" State as \"([^\"]*)\" and Assigned Group as \"([^\"]*)\" and Assigned To as \"([^\"]*)\" from the incident list$")
	public void verifyValuesAfterIncidentCreated(String priorityValue, String stateValue, String assignedGroup, String assignedTo)
			throws Throwable {

		WebElement priorityValueLoc = Abstract.waitUntilConditionSatisfy(base, IncidentPage.priorityVerify());
		String priorityValueText = priorityValueLoc.getText();
		Assert.assertEquals(priorityValueText, priorityValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("Verify Priority Value");
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		
		WebElement stateVerify = Abstract.waitUntilConditionSatisfy(base, IncidentPage.stateVerify());
		String stateText = stateVerify.getText();
		Assert.assertEquals(stateText, stateValue);
		logger.info("Verify State Value");
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		WebElement assignedGroupLoc = Abstract.waitUntilConditionSatisfy(base, IncidentPage.assignmentGroupVerify());
		String assignedGroupValue = assignedGroupLoc.getText();
		Assert.assertEquals(assignedGroupValue, assignedGroup);
		logger.info("Verify AssignedGroup Value");
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		WebElement assignedToLoc = Abstract.waitUntilConditionSatisfy(base, IncidentPage.assignedToVerify());
		String assignedToText = assignedToLoc.getText();
		Assert.assertEquals(assignedToText, assignedTo);
		logger.info("Verify AssignedTo Value");
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Then("^Click on recent Incident Created$")
	public void selectIncident() throws Throwable {
		
		WebElement selectIncident = Abstract.waitUntilConditionSatisfy(base, IncidentPage.selectIncident());
		selectIncident.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		selectIncident.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("Click on Recent Incident Created");
	}

	@Then("^Verify Major incident Tab is available on screen$")
	public void verifyMajorIncident() throws Throwable {
		WebElement majorIncident = Abstract.waitUntilConditionSatisfy(base, IncidentPage.majorIncident());
		Abstract.scrolldown(base);
		Boolean status = majorIncident.isEnabled();
		Assert.assertTrue(status);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Verify Major incident Tab is available on screen");
	}

	@Then("^Tap on Major incident tab button$")
	public void tapOnMajorIncident() throws Throwable {
		WebElement majorIncidentTab = Abstract.waitUntilConditionSatisfy(base, IncidentPage.majorIncident());
		majorIncidentTab.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Tap on Major incident tab button");
	}

	
	@Then("Select incident state as \"([^\"]*)\"$")
	public void incidentState(String incidentStateValue) throws IOException, AWTException, InterruptedException {
		WebElement incidentStateLoc = Abstract.waitUntilConditionSatisfy(base, IncidentPage.incidentState());
		Abstract.selectTheDropDownList(base, incidentStateLoc, incidentStateValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Select Incident State as :" + incidentStateLoc);
	}
	
	@Then("^Click on Resolve Button$")
	public void resolveButton() throws Throwable {
		WebElement resolveButton = Abstract.waitUntilConditionSatisfy(base, IncidentPage.resolveButton());
		resolveButton.click();
		Thread.sleep(5000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("Click on Resolve Button");
	}

	@Then("^Click on Resolution Information Tab$")
	public void resolutionInformation() throws Throwable {
		WebElement resolutionInformation = Abstract.waitUntilConditionSatisfy(base,
				IncidentPage.resolutionInformation());
		resolutionInformation.click();
		resolutionInformation.click();
		Abstract.scrolldown(base);
		Thread.sleep(5000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click on Resolution Information Tab");
	}

	@Then("Select Resolution Code as \"([^\"]*)\"$")
	public void resolutionCode(String resolutionCodeValue) throws IOException, AWTException, InterruptedException {
		Abstract.scrolldown(base);
		WebElement resolutionCode = Abstract.waitUntilConditionSatisfy(base, IncidentPage.resolutionCode());
		Abstract.selectTheDropDownList(base, resolutionCode, resolutionCodeValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Select Resolution Code as :" + resolutionCodeValue);
	}

	@Then("^Enter Resolution Note as \"([^\"]*)\"$")
	public void resolutionNote(String resolutionNoteValue) throws Throwable {

		WebElement resolutionNote = Abstract.waitUntilConditionSatisfy(base, IncidentPage.resolutionNote());
		resolutionNote.clear();
		resolutionNote.sendKeys(resolutionNoteValue);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Enter Resolution Note");

	}

	@Then("^Click On Problem LookUP$")
	public void problemLookUp() throws Throwable {

		WebElement problemLookUp = Abstract.waitUntilConditionSatisfy(base, IncidentPage.problemLookUp());
		problemLookUp.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click On Problem LookUP");

	}

	@Then("^Click on Close Incident$")
	public void closeIncident() throws Throwable {
		WebElement closeIncident = Abstract.waitUntilConditionSatisfy(base, IncidentPage.closeIncident());
		closeIncident.click();
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Click on Close Incident");
	}
	
	
	@Then("^Validate State as \"([^\"]*)\" the incident list$")
	public void validateStateAfterCloseIncident(String stateValueAfterCloseIncident)
			throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement stateVerify = Abstract.waitUntilConditionSatisfy(base, IncidentPage.stateVerify());
		String stateText = stateVerify.getText();
		System.out.println("#@@@@@@@@@#################"+ stateText);
		Assert.assertEquals(stateText, stateValueAfterCloseIncident);
		logger.info("Verify State Value");
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}
}
