package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

public class BasePage {

    protected final WebDriver localDriver;
    protected final WebDriverWait wait;

    BasePage(WebDriver driver){
        localDriver = driver;
        wait = new WebDriverWait(localDriver, Duration.ofSeconds(15));
    }


    protected void waitForElementToBeDisplayed(By locator){
        wait.until(driver -> driver.findElement(locator).isDisplayed());
    }

    protected void waitForElementToBeEnabled(By locator){
        wait.until(driver -> driver.findElement(locator).isEnabled());
    }
    public static void clickElementByJS(WebElement element) {


    }


}
