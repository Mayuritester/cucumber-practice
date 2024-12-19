package practicecucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import practicecucumber.pages.HomePage;
import practicecucumber.pages.RegisterPage;

public class RegisterSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }


    @When("I click on the Register link")
    public void iClickOnTheRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the text Register")
    public void iShouldSeeTheTextRegister() {
        Assert.assertEquals(new RegisterPage().getRegisterText(),"Register","Register text is not displayed");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message First name is required.")
    public void iShouldSeeTheErrorMessageFirstNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("FirstName"),"First name is required.","First name is required");
    }

    @And("I should see the error message Last name is required.")
    public void iShouldSeeTheErrorMessageLastNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("LastName"),"Last name is required.","Last name is required");
    }

    @And("I should see the error message Email is required.")
    public void iShouldSeeTheErrorMessageEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Email"),"Email is required.","Email is required");
    }

    @And("I should see the error message password is required.")
    public void iShouldSeeTheErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Password"),"password is required.","Password is required");
    }

    @And("I should see the error message confirm password is required.")
    public void iShouldSeeTheErrorMessageConfirmPasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Confirm password"),"password is required","Confirm password is required");
    }

    @And("I select the gender female")
    public void iSelectTheGenderFemale() {
        new RegisterPage().selectGender("Female");
    }

    @And("I enter the first name {string}")
    public void iEnterTheFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter the last name {string}")
    public void iEnterTheLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String email) {
        new RegisterPage().enterEmail(email);

    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter the confirm password {string}")
    public void iEnterTheConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("I should see the message Your registration completed")
    public void iShouldSeeTheMessageYourRegistrationCompleted() {
        Assert.assertEquals(new RegisterPage().getYourRegCompletedText(),"Your registration completed","Your registration completed is not displayed");
    }
}
