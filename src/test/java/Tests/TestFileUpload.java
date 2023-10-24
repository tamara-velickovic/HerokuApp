package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class TestFileUpload extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {

        driver.navigate().to("https://the-internet.herokuapp.com/");


    }

    @org.testng.annotations.Test
    public void Test() {

        String location = "C:\\Users\\mik\\Desktop\\Test.txt";

        homePage.clickOnFileUpload();
        uploadPage.chooseFile(location);
        uploadPage.clickOnUploadButton();

        Assert.assertEquals(uploadPage.uploadedFileBox.getText(), "Test.txt");
    }







}
