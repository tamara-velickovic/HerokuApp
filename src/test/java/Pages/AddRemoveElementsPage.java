package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage extends BaseTest {


    public AddRemoveElementsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/button")
    public WebElement addElementButton;

    @FindBy(xpath ="/html/body/div[2]/div/div/div/button")
    public WebElement deleteButton;


//------------------------------------


    public void clickOnAddElementButton() {

        addElementButton.click();

    }

    public void clickOnDeleteButton() {

        deleteButton.click();

    }


    }