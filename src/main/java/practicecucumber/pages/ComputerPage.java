package practicecucumber.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import practicecucumber.utility.Utility;

import java.util.List;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class);

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sublist']/li/a")
    List<WebElement> subMenuLinks;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text : " + pageTitle.getText());
        return message;
    }

    public void clickOnSubMenu(String subTab) {
        for (WebElement menu : subMenuLinks) {
            System.out.println(menu.getText());
            if (menu.getText().trim().contains(subTab)) {
                log.info("Click on '" + subTab + "' link");
                clickOnElement(menu);
                break;
            }
        }
    }
}
