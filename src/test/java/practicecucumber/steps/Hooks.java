package practicecucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import practicecucumber.propertyreader.PropertyReader;
import practicecucumber.utility.Utility;

public class Hooks extends Utility {

    /**
     * Created by Jay Vaghani
     */

        @Before
        public void setUp() {
            selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        }

        @After
        public void tearDown(Scenario scenario) {
            if (scenario.isFailed()) {
                final byte[] screenshot = getScreenShot();
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
            closeBrowser();
        }

    }
