package base;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = DriverManager.getDriver();

    }

   @AfterMethod
  public void tearDown() {
        DriverManager.quitDriver();
    }


}
