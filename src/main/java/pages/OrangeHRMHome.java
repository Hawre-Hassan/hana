package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){PageFactory.initElements(Driver.getDriver(),this);}
    private static final Logger logger=Logger.getLogger(OrangeHRMHome.class);

    @FindBy(xpath = "//h1[.='Dashboard']")
    private WebElement dashBoard;



    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastname;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement personalDetailsHeader;
    @FindBy(id = "chkLogin")
    private WebElement addLoginDetails;
    @FindBy(id = "user_name")
    private WebElement userName;
    @FindBy(id = "user_password")
    private WebElement password;
    @FindBy(id = "re_password")
    private WebElement confirmPassword;
    @FindBy(id = "status")
    private WebElement statusDropdown;

    public void setDashBoard() {
        Assert.assertEquals("Dashboard",dashBoard.getText());
    }
    public void setDashBoard(String str) {
        Assert.assertEquals(str,dashBoard.getText());
    }

    public void setPIM() {
        (PIM).click();
    }

    public void setAddEmployee() {
        addEmployee.click();
    }

    public void setFirstName(String firstname) {

         firstName.sendKeys(firstname);
        logger.info(firstname+"successfully is entered");
    }

    public void setLastname(String lastName) {
        lastname.sendKeys(lastName);
        logger.info(lastName+"successfully is entered");
    }

    public void setSaveButton() {
        saveButton.click();
        logger.info("save button successfully added");
    }

    public void setPersonalDetailsHeader(String expectedHeader) {
        staticWait(2);
        Assert.assertEquals(expectedHeader,personalDetailsHeader.getText());
    }

    public void setAddLoginDetails() {
        addLoginDetails.click();
    }

    public void setUserName(String username) {
        userName.sendKeys(username);
    }

    public void setPassword(String passWord) {
        password.sendKeys(passWord);
    }

    public void setConfirmPassword(String confirmpassword) {
        confirmPassword.sendKeys(confirmpassword);
    }

    public void setStatusDropdown(String statusdropdown) {
        selectFromDropDown(statusDropdown,statusdropdown);
    }
}
