package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pages.OrangeHRMAdmin;
import pages.OrangeHRMHome;
import pages.OrangeHRMLogin;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OrangeHRMSteps extends BrowserUtils {
    OrangeHRMLogin orangeHRMLogin=new OrangeHRMLogin();
    OrangeHRMHome orangeHRMHome=new OrangeHRMHome();
    OrangeHRMAdmin orangeHRMAdmin=new OrangeHRMAdmin();
    private static final Logger logger=Logger.getLogger(OrangeHRMHome.class);
    @Given("the user wants to OrangeHrm website")
    public void the_user_wants_to_orange_hrm_website() {
//We deleted  whatever here before because it was information only and it helps cucumber to throw exception when steps doesn't have code

        System.out.println("Browser launched and testing started");
Driver.getDriver().get(ConfigurationReader.getProperties("OrangeHRMTest"));
    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
orangeHRMLogin.setUserName(ConfigurationReader.getProperties("UserName"));
orangeHRMLogin.setPassWord(ConfigurationReader.getProperties("Password"));
    }
    @Then("the user wants to click on login button")
    public void the_user_wants_to_click_on_login_button() {
orangeHRMLogin.setLoginButton();
    }
    @Then("the user wants to verify that browser loaded on Dashboard")
    public void the_user_wants_to_verify_that_browser_loaded_on_dashboard() {
orangeHRMHome.setDashBoard();
        System.out.println("Verification succeeded and test ended for this step");
    }

    @Then("the user wants to verify that browser loaded on {string}")
    public void the_user_wants_to_verify_that_browser_loaded_on(String string) {
orangeHRMHome.setDashBoard(string);
    }


    @Then("the user wants to click on PIM Module")
    public void the_user_wants_to_click_on_pim_module() {
orangeHRMHome.setPIM();
    }
    @Then("the user wants to go toAdd Employee Page")
    public void the_user_wants_to_go_to_add_employee_page() {
orangeHRMHome.setAddEmployee();
    }
    @Then("the user wants to add first name as {string}")
    public void the_user_wants_to_add_first_name_as(String string) {
orangeHRMHome.setFirstName(string);
    }
    @Then("the user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String string) {
orangeHRMHome.setLastname(string);
    }
    @Then("the user wants to save personal information")
    public void the_user_wants_to_save_personal_information() {
orangeHRMHome.setSaveButton();
    }
    @Then("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {
orangeHRMHome.setPersonalDetailsHeader(string);
    }

    @Then("the user wants to add employee's first name and last name as following")
    public void the_user_wants_to_add_employee_s_first_name_and_last_name_as_following(Map<String,String>datatable) {
orangeHRMHome.setFirstName(datatable.get("FirstName"));
orangeHRMHome.setLastname(datatable.get("LastName"));
    }
    @Then("the user wants to add login details as following")
    public void the_user_wants_to_add_login_details_as_following(Map<String,String> dataTable) {
orangeHRMHome.setAddLoginDetails();
orangeHRMHome.setUserName(dataTable.get("UserName"));
orangeHRMHome.setPassword(dataTable.get("Password"));
orangeHRMHome.setConfirmPassword(dataTable.get("Password"));
orangeHRMHome.setStatusDropdown(dataTable.get("Status"));
    }
    @Then("the user wants to add employee's first and last name as following list")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following_list(List<List<String>> dataTable) {
orangeHRMHome.setFirstName(dataTable.get(1).get(0));
orangeHRMHome.setLastname(dataTable.get(1).get(1));
    }
    @Then("the user wants to add login in a list way")
    public void the_user_wants_to_add_login_in_a_list_way(List<List<String>> dataTable) {
orangeHRMHome.setAddLoginDetails();  //Row  Column
orangeHRMHome.setUserName(dataTable.get(1).get(0));
orangeHRMHome.setPassword(dataTable.get(1).get(1));
orangeHRMHome.setConfirmPassword(dataTable.get(1).get(1));
orangeHRMHome.setStatusDropdown(dataTable.get(1).get(2));
    }

    @Then("the user wants to add login information {string} {string} {string}")
    public void the_user_wants_to_add_login_information(String username, String password, String status) {
        orangeHRMHome.setAddLoginDetails();
        logger.info("button login details successfully added");
        orangeHRMHome.setUserName(username);
        logger.info(username + "provided as username");
        orangeHRMHome.setPassword(password);
        orangeHRMHome.setConfirmPassword(password);
        orangeHRMHome.setStatusDropdown(status);
    }
    @Then("the user wants to add employees as {string} {string}")
    public void the_user_wants_to_add_employees_as(String firstName, String lastName) {
orangeHRMHome.setFirstName(firstName);
orangeHRMHome.setLastname(lastName);
    }

    @Then("the user wants to go to Admin Module")
    public void the_user_wants_to_go_to_admin_module() {
orangeHRMAdmin.setAdminButton();
    }
    @Then("the user wants to go to Nationalities Section")
    public void the_user_wants_to_go_to_nationalities_section() {
orangeHRMAdmin.setNationalitiesSection();
    }
    @Then("the user wants to click on add new nationality")
    public void the_user_wants_to_click_on_add_new_nationality() {
orangeHRMAdmin.setAddedButton();
    }
    @Then("the user wants to add new nationalities as {string}")
    public void the_user_wants_to_add_new_nationalities_as(String nationality) {
orangeHRMAdmin.setNameOfNationalityBox(nationality);
orangeHRMAdmin.setSaveButton();
orangeHRMAdmin.setNationalitiesList(nationality);
    }
    @Given("the user wants to login orangeHRM using Excel File")
    public void the_user_wants_to_login_orange_hrm_using_excel_file() throws IOException {
Driver.getDriver().get(ConfigurationReader.getProperties("OrangeHRMTest"));
String filePath="C:\\Users\\Marry\\Desktop\\BDD\\src\\test\\resources\\Untitled spreadsheet.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        System.out.println(sheet.getRow(0).getCell(0).toString());
        System.out.println(sheet.getRow(0).getCell(1).toString());
        System.out.println(sheet.getRow(1).getCell(0).toString());
        System.out.println(sheet.getRow(1).getCell(1).toString());

        int rows=sheet.getLastRowNum();  //It tells how many rows we have in sheet
        int columns=sheet.getRow(0).getLastCellNum();

        System.out.println("Total Rows : "+rows+ "Total column: "+columns);

        String username=sheet.getRow(1).getCell(0).toString();
        String password=sheet.getRow(1).getCell(0).toString();
       // orangeHRMLogin.setDataFromExcel(sheet.getRow(1).getCell(0).toString(),sheet.getRow(1).getCell(1).toString());
   orangeHRMLogin.setDataFromExcel(username,password); }
}
