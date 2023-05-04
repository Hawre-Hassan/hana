package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.BrowserUtils;
import utils.Driver;

public class Hooks extends BrowserUtils {
    private final static Logger logger=Logger.getLogger(Hooks.class);
    @Before
    public void setup(){
        Driver.getDriver();
        logger.info("Driver successfully started");
        //setWaitTime();
        Driver.getDriver().manage().window().maximize();}
    @After
    public void TearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());}


           // Driver.closeDriver();
        }

    }
//we have hooks class because we need pre-setup of scenarios and closing driver.
//we need to have under Stepsdefinition package so that we don't have extend it to any other class; since cucumber is present class
// cucumber will automatically detect it