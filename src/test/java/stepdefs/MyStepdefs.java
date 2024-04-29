package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pom.loginPOM;
import pom.dashboardPOM;
import utilities.webDriverSession;

import java.net.MalformedURLException;

public class MyStepdefs {

    WebDriver wb;
    loginPOM l;
    dashboardPOM d;
    @Given("User is on the login screen on the browser")
    public void userIsOnTheLoginScreenOnTheBrowser() throws MalformedURLException {
        wb = webDriverSession.createSession("chrome");
        l = new loginPOM(wb);
        l.get();
        l.delay();


    }

    @When("User adds email as {string}")
    public void userAddsEmailAsUsername(String email) {
        l.emailFill(email);
        
    }

    @And("User adds password as {string}")
    public void userAddsPasswordAsPassword(String pass) {
        l.passwordFill(pass);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        d = l.submitButton();
    }

    @Then("User logins successfully and can access the dashboard")
    public void userLoginsSuccessfullyAndCanAccessTheDashboard() {
        d.delayWait();
    }

    @Given("User can see the dropdown on the left hand side of the dashboard")
    public void userCanSeeTheDropdownOnTheLeftHandSideOfTheDashboard() {

        Assert.assertEquals(d.wb.findElement(By.xpath("//button[@vwo-simple-collapsible='insights']/span")).getText(),"Insights");



    }
    @When("User clicks on Insights drop down")
    public void userClicksOnInsightsDropDown() {
        d.insightsDropDown();
        
    }

    @And("Clicks on Forms option in Insights drop down")
    public void clicksOnFormsOptionInInsightsDropDown() {
        d.forms();
    }
    @And("Clicks on Start Tracking your forms button on the Form Analytics page")
    public void clicksOnStartTrackingYourFormsButtonOnTheFormAnalyticsPage() {

        d.startTrackingForms();
    }


    @Then("The button succesfully navigates user and User reaches a New Campaign page")
    public void theButtonSuccesfullyNavigatesUserAndUserReachesANewCampaignPage() {
        Assert.assertEquals(d.wb.getCurrentUrl(),"https://app.vwo.com/#/analyze/create/web/form-analysis");
    }



    @When("User clicks on Manual setup using Form Name or ID or CSS Selector radio button as the Select an option to setup form tracking option")
    public void userClicksOnManualSetupUsingFormNameOrIDOrCSSSelectorRadioButtonAsTheSelectAnOptionToSetupFormTrackingOption() {
        d.manualSetUp();
    }

    @And("User enters their website {string} in the text box under Enter URLs where you want to track the form")
    public void userEntersTheirWebsiteUrlInTheTextBoxUnderEnterURLsWhereYouWantToTrackTheForm(String url) {
        d.websiteEntering(url);
    }

    @And("Selects the Enable Scheduling checkbox under the Advanced Options category")
    public void selectsTheEnableSchedulingCheckboxUnderTheAdvancedOptionsCategory() {
        d.enableScheduling();
    }


    @Then("The user clicks on Create button ,The user has successfully setup and campaign for tracking the form analysis for their website")
    public void theUserClicksOnCreateButtonTheUserHasSuccessfullySetupAndCampaignForTrackingTheFormAnalysisForTheirWebsite() {
        d.createButton();
    }
}
