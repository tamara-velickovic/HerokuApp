package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;


public class TestAddRemove extends BaseTest {


 @BeforeMethod
 public void pageSetUp() {

 driver.navigate().to("https://the-internet.herokuapp.com/");


 }

 @org.testng.annotations.Test
 public void Test() {

 homePage.clickOnAddRemoveElements();
 elementsPage.clickOnAddElementButton();
  Assert.assertTrue(elementsPage.deleteButton.isDisplayed());

 elementsPage.clickOnDeleteButton();
  Assert.assertFalse(elementsPage.deleteButton.isDisplayed());

 }




}
