package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Add/Remove Elements")
    public WebElement addRemoveElements;

    @FindBy (linkText = "File Upload")
    public WebElement fileUploadLink;

//-------------------------------------

  public void clickOnAddRemoveElements() {

      addRemoveElements.click();


  }

    public void clickOnFileUpload() {

        fileUploadLink.click();


    }


}
