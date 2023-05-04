package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class OrangeHRMLogin extends BrowserUtils {
    public OrangeHRMLogin(){PageFactory.initElements(Driver.getDriver(),this);}
    private static final Logger logger=Logger.getLogger(OrangeHRMLogin.class);

    @FindBy(id = "txtUsername")
    private WebElement userName;
    @FindBy(id = "txtPassword")
    private WebElement passWord;
    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    public void setUserName(String username) {
        staticWait(1);
       userName.sendKeys(username);
    }

    public void setPassWord(String password) {
        passWord.sendKeys(password);
        logger.info(password+"password is successfully entered");
    }

    public void setLoginButton() {
        loginButton.click();
    }

public void setDataFromExcel(String username, String password){
 userName.sendKeys(username);
 passWord.sendKeys(password);
 loginButton.click();
}
}

