package practicecucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import practicecucumber.pages.BuildYourOwnComputerPage;
import practicecucumber.pages.ComputerPage;
import practicecucumber.pages.DesktopsPage;
import practicecucumber.pages.HomePage;

public class ComputerSteps {

    @When("I click on the COMPUTERS tab")
    public void iClickOnTheCOMPUTERSTab() {
        new HomePage().clickOnMenuTab("COMPUTERS");
    }

    @Then("I should see the text Computer")
    public void iShouldSeeTheTextComputer() {
        Assert.assertEquals(new ComputerPage().getPageTitleText(),"Computers","Computers text is not displayed");
    }

    @And("I click on the Desktops link")
    public void iClickOnTheDesktopsLink() {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("I should see the text Desktops")
    public void iShouldSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopsPage().getPageTitleText(),"Desktops","Desktops text is not displayed");
    }

    @And("I click on the product name Build your own computer")
    public void iClickOnTheProductNameBuildYourOwnComputer() {
        new DesktopsPage().selectProduct("Build your own computer");
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processorName) {
        new BuildYourOwnComputerPage().selectProcessor(processorName);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ramGB) {
        new BuildYourOwnComputerPage().selectRam(ramGB);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hDdGB) {
        new BuildYourOwnComputerPage().selectHDD(hDdGB);
    }

    @And("I select OS {string}")
    public void iSelectOS(String oSName) {
        new BuildYourOwnComputerPage().selectOS(oSName);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String softwareName) {
        new BuildYourOwnComputerPage().selectSoftware(softwareName);
    }

    @And("I click on ADD TO CART button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should see the message The product has been added to your shopping cart")
    public void iShouldSeeTheMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductAddedMessage(),"The product has been added to your shopping cart","The product has been added to your shopping cart is not displayed");
    }
}
