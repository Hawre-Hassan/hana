package pages;

import io.cucumber.java.et.Ja;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class guru99TelecomHome extends BrowserUtils {
    public guru99TelecomHome(){
        PageFactory.initElements(Driver.getDriver(),this);}
    private static final Logger logger=Logger.getLogger(guru99TelecomHome.class);
    @FindBy(xpath = "(//a[@href='addcustomer.php'])[1]")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement addCustomerHeader;
    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement>backgroundCheck;
    @FindBy(id = "fname")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lname']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement address;
    @FindBy(id = "telephoneno")
    private WebElement mobileNumber;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submit;
    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
    private WebElement verificationHeader;

    public void setAddCustomerButton() {
        addCustomerButton.click();


    Actions actions=new Actions(Driver.getDriver());
    actions.moveByOffset(0,0).click().build().perform();}
    public void setAddCustomerHeader(String addcustomerHeader) {
        Assert.assertEquals(addCustomerHeader.getText(),addcustomerHeader);

       /* JavascriptExecutor js=new (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)");  */
    }

    public void setBackgroundCheck(String backgroundcheck) {
        for (WebElement each:backgroundCheck){
            if (each.getAttribute("id").equals(backgroundcheck)){
                //each.click();
                JavascriptExecutor excutor=(JavascriptExecutor) Driver.getDriver();
            excutor.executeScript("arguments[0].click();",each);
            //When we have elementnotinteractable exception we can use javascript executor to handle it.
                //Either actions and javascriptexecutor help us to execute javascript in the browser;
            }
            else {logger.error("The option you have provided not found. Please check your selection");
                logger.error(backgroundcheck+"is the provided option");
            }
        }
    }

    public void setFirstName(String firstname) {
        firstName.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void setEmail(String emaill) {
        email.sendKeys(emaill);
    }

    public void setAddress(String Address) {
        address.sendKeys(Address);
    }

    public void setMobileNumber(String mobilenumber) {
        mobileNumber.sendKeys(mobilenumber);
    }

    public void setSubmit() {
        submit.click();
    }

    public WebElement getVerificationHeader() {     //This is getter method as we removed 'void, instead entered 'WebElement' returned to itself.
       return   verificationHeader;
    }
}
