package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.BrowserUtils;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "@target/rerun.txt", //This is to connect feature sile with runner class
            //COPY PATH FROM CONTENT ROOT
            glue = "stepDefinitions",//This is to connect steps with runner class
            //COPY PATH FROM SOURCE ROOT
            dryRun = false, //This is to get Undefined steps without opening up browser
            plugin={"pretty","rerun:target/rerun.txt",

                    "html:target/default-cucumber-reports.html","json:target/cucumber.json",
                    //this is to generate reports
            }
//we can run them for FailedRunner class

    )
public class FailedRunner {
}
