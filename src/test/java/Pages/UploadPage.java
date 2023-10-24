package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage extends BaseTest {

    public UploadPage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "file-upload")
    public WebElement chooseFileButton;

    @FindBy (id =  "file-submit")
    public WebElement uploadButton;


    @FindBy (id =  "uploaded-files")
    public WebElement uploadedFileBox;

    @FindBy (id = "content")
    public WebElement message;

//------------------------------------------


    public void chooseFile(String s) {


        chooseFileButton.sendKeys(s);


    }


    public void clickOnUploadButton() {

        uploadButton.click();


    }





}
