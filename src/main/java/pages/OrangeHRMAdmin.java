package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class OrangeHRMAdmin extends BrowserUtils {
    public OrangeHRMAdmin(){
        PageFactory.initElements(Driver.getDriver(),this);}
    private static final Logger logger=Logger.getLogger(OrangeHRMAdmin.class);

    public void setAdminButton() {
        adminButton.click();
    }

    public void setNationalitiesSection() {
        nationalitiesSection.click();
    }

    public void setAddedButton() {
        addedButton.click();
    }

    public void setNameOfNationalityBox(String nameofNationalityBox) {
        nameOfNationalityBox.sendKeys(nameofNationalityBox);
    }

    public void setSaveButton() {
        saveButton.click();
    }
    public void setNationalitiesList(String nationality) {
      for (WebElement each :nationalitiesList){
          if (each.getText().equals(nationality)) {
              Assert.assertEquals(each.getText(), nationality);
          } else if (!each.getText().equals(nationality)) {
          } else if (nationality.isEmpty()) {

              
          }
      }
    }

        
    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminButton;
    @FindBy(id = "menu_admin_nationality")
    private WebElement nationalitiesSection;
    @FindBy(id = "btnAdd")
    private WebElement addedButton;
    @FindBy(id = "nationality_name")
    private WebElement nameOfNationalityBox;
    @FindBy(id = "btnSave")
    private WebElement saveButton;

    @FindBy(xpath = "//table//tr//td[4]//a")
    private List<WebElement> nationalitiesList;


}
