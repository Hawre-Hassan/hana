package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.guru99TelecomHome;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import java.awt.dnd.DragGestureEvent;

public class guru99TelecomSteps extends BrowserUtils {

    private static final Logger logger=Logger.getLogger(guru99TelecomSteps.class);
   guru99TelecomHome guru99TelecomHome=new guru99TelecomHome();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
Driver.getDriver().get(ConfigurationReader.getProperties("guru99TelecomUrl"));
    }
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        guru99TelecomHome.setAddCustomerButton();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String string) {
guru99TelecomHome.setAddCustomerHeader(string);
setWaitTime();
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String background) {
guru99TelecomHome.setBackgroundCheck(background);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String firstName, String lastName, String email, String address, String phonenumber) {
guru99TelecomHome.setFirstName(firstName);
logger.info("First name is successfully provided");
guru99TelecomHome.setLastName(lastName);
logger.info("Last name is successfully provided");
guru99TelecomHome.setEmail(email);
logger.info("email name is successfully provided");
guru99TelecomHome.setAddress(address);
logger.info("address name is successfully provided");
guru99TelecomHome.setMobileNumber(phonenumber);
logger.info("Phone Number name is successfully provided");
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
guru99TelecomHome.setSubmit();
        Assert.assertEquals(guru99TelecomHome.getVerificationHeader().getText(),string);
    }
}
