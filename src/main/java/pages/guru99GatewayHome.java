package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class guru99GatewayHome extends BrowserUtils {
    public guru99GatewayHome(){
        PageFactory.initElements(Driver.getDriver(),this);}
    //we use Private because this is where we apply encapsulation


    //Whenever we run scenario, first constructor of this class will be called to initiate driver
    //Then it will locate elements
    //Then it will trigger the methods That we created under this class
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;
    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement QuantityDropDown;
    public void getBuyNow() {
        buyNow.click();
    }
    public void getQuantityDropDown(String str) {
        Select select=new Select(QuantityDropDown);
        select.selectByValue(str);
    }
}
