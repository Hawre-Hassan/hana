package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class guru99GatewayOrderSuccess extends BrowserUtils {
    public guru99GatewayOrderSuccess(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verificationText;

    public void setVerificationText(String expectedMessage) {
        Assert.assertEquals(verificationText.getText(),expectedMessage);
    }
}
