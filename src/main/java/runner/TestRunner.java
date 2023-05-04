package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)   //We are connecting Junit here
@CucumberOptions(
        features = "src/test/resources", //This is to connect feature file with runner class
        //COPY PATH FROM CONTENT ROOT
        glue = "stepDefinitions",//This is to connect steps with runner class
        //COPY PATH FROM SOURCE ROOT
        tags = "@Regression",
        dryRun = false, //This is to get Undefined steps without opening up browser
        plugin= {"pretty", "rerun:target/rerun.txt", //THIS IS TO HELP US TO STORE FAILED SCENARIOS IN RERUN TXT FILE SO THAT
                //WE CAN RUN THEM FROM FAILEDRUNNER CLASS

                "html:target/default-cucumber-reports.html","json:target/cucumber.json",
                //this is to generate reports
        }


)
public class TestRunner {}
