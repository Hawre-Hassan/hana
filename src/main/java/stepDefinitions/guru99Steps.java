package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.guru99GatewayHome;
import pages.guru99GatewayOrderSuccess;
import pages.guru99GatewayPaymentPage;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import java.util.List;
import java.util.Map;

public class guru99Steps extends BrowserUtils {
    guru99GatewayHome guru99GatewayHome = new guru99GatewayHome();
    guru99GatewayOrderSuccess guru99GatewayOrderSuccess = new guru99GatewayOrderSuccess();
    guru99GatewayPaymentPage guru99GatewayPaymentPage = new guru99GatewayPaymentPage();

    @Given("the user wants to go payment gateway website")
    public void the_user_wants_to_go_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationReader.getProperties("demoURL"));
        setWaitTime();
    }

    @When("the user wants to buy an elephant toy")
    public void the_user_wants_to_buy_an_elephant_toy() {
        guru99GatewayHome.getQuantityDropDown("1");
        guru99GatewayHome.getBuyNow();
    }

    @Then("the user wants to provide payment information")
    public void the_user_wants_to_provide_payment_information() {
        guru99GatewayPaymentPage.setCardNumber("5454545454545454");
        guru99GatewayPaymentPage.setMonth("10");
        guru99GatewayPaymentPage.setYear("2022");
        guru99GatewayPaymentPage.setCcv("369");
    }

    @Then("the user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        guru99GatewayPaymentPage.setPayButton();
    }

    @Then("the user wants to verify message is successful")
    public void the_user_wants_to_verify_message_is_successful() {
        guru99GatewayOrderSuccess.setVerificationText("Payment successfull!");
    }


    @When("the user wants to buy elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String string) {
        guru99GatewayHome.getQuantityDropDown(string);
        guru99GatewayHome.getBuyNow();
    }

    @Then("the suer wants to enter credit card number as {string}")
    public void the_suer_wants_to_enter_credit_card_number_as(String string) {
        guru99GatewayPaymentPage.setCardNumber(string);
    }

    @Then("the user wants to enter expiration month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        guru99GatewayPaymentPage.setMonth(string);
    }

    @Then("the user wants to enter expiration year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        guru99GatewayPaymentPage.setYear(string);
    }

    @Then("the user wants to enter cvv code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guru99GatewayPaymentPage.setCcv(string);
    }

    @Then("the user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99GatewayOrderSuccess.setVerificationText(string);
    }

    @Then("the user wants to provide entry payment information as following")
    public void the_user_wants_to_provide_entry_payment_information_as_following(Map<String,String> dataTable) {
        guru99GatewayPaymentPage.setCardNumber(dataTable.get("CNumber"));
        guru99GatewayPaymentPage.setMonth(dataTable.get("EMonth"));
        guru99GatewayPaymentPage.setYear(dataTable.get("EYear"));
        guru99GatewayPaymentPage.setCcv(dataTable.get("CvvCode"));
    }

    @Then("the user wants to provide entry payment information as following list")
    public void the_user_wants_to_provide_entry_payment_information_as_following_list(List<List<String>> dataTable) {
guru99GatewayPaymentPage.setCardNumber(dataTable.get(0).get(1));
guru99GatewayPaymentPage.setMonth(dataTable.get(1).get(1));
guru99GatewayPaymentPage.setYear(dataTable.get(2).get(1));
guru99GatewayPaymentPage.setCcv(dataTable.get(3).get(1));
    }

    @When("the user wants to buy elephant toy as following quantity")
    public void the_user_wants_to_buy_elephant_toy_as_following_quantity(List<List<String>> dataTable) {
guru99GatewayHome.getQuantityDropDown(dataTable.get(1).get(0));
guru99GatewayHome.getBuyNow();
    }
    @Then("the user wants to provide entry payment information as following list1")
    public void the_user_wants_to_provide_entry_payment_information_as_following_list1(List<List<String>> dataTable) {
guru99GatewayPaymentPage.setCardNumber(dataTable.get(1).get(0));
guru99GatewayPaymentPage.setMonth(dataTable.get(1).get(1));
guru99GatewayPaymentPage.setYear(dataTable.get(1).get(2));
guru99GatewayPaymentPage.setCcv(dataTable.get(1).get(3));
    }
}

/*

guru99GatewayPaymentPage.setCardNumber(dataTable.get(0).get(1));
        guru99GatewayPaymentPage.setMonth(dataTable.get(1).get(1));
        guru99GatewayPaymentPage.setYear(dataTable.get(2).get(1));
        guru99GatewayPaymentPage.setCcv(dataTable.get(3).get(1));  */