package practicecucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import practicecucumber.pages.HomePage;
import practicecucumber.pages.LoginPage;

public class LoginSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {

    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        new HomePage().clickOnLoginLink();
    }

    @When("I enter an invalid EmailId {string}")
    public void iEnterAnInvalidEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter an invalid Password {string}")
    public void iEnterAnInvalidPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Error message not displayed");
    }

    @When("I enter a valid EmailId {string}")
    public void iEnterAValidEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter a valid password {string}")
    public void iEnterAValidPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("I should see the {string} link displayed")
    public void iShouldSeeTheLinkDisplayed(String LogOut) {
        Assert.assertEquals(new HomePage().isLogOutLinkDisplay(),LogOut,"Logout link is not displayed");
    }

    @Given("I am logged in with EmailId {string} and Password {string}")
    public void iAmLoggedInWithEmailIdAndPassword(String email, String password) {
        new LoginPage().enterEmailId(email);
        new LoginPage().enterPassword(password);
    }

    @When("I click on the logout link")
    public void iClickOnTheLogoutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("I should see the login link displayed")
    public void iShouldSeeTheLoginLinkDisplayed(String loginLink) {
        Assert.assertEquals(new HomePage().isLogInLinkDisplay(),loginLink,"Login link is  not displayed");
    }


}
