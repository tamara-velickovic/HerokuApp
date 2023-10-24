package Base;

import Pages.AddRemoveElementsPage;
import Pages.HomePage;
import Pages.UploadPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

 public static WebDriver driver;
 public WebDriverWait wait;

 public HomePage homePage;
 public AddRemoveElementsPage elementsPage;

 public UploadPage uploadPage;


    @BeforeClass
  public void setUp() {

     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    homePage= new HomePage();
    elementsPage = new AddRemoveElementsPage();
    uploadPage = new UploadPage();
 }

 @AfterClass
 public void tearDown() {

 // driver.quit();


 }









}
