package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class LoginPopup extends BasePage{
    //"//div[@id='login']//form//button"
    /*
        actions.moveToElement((WebElement) loginButton).perform();
        ((WebElement) loginButton).click();
     */
    public LoginPopup(WebDriver driver) {
        super(driver);
    }
    protected By emailInput = By.name("email");
    protected By passwordInput = By.name("password");
    protected By loginButton = By.xpath("(//li/a)[5]");
    protected By errorMessage = By.xpath("//div[contains(@class, 'alert-error')]//div");
    protected By twoLoginButton=By.xpath("(//div/button)[4]");
    protected By succesLogin=By.xpath("//div[text()='Giriş başarılı']");

    public void clickLogin(){
        localDriver.get("https://www.secilstore.com/");
        localDriver.findElement(loginButton).click();
        wait.until(driver -> driver.findElement(loginButton).isDisplayed());

    }

    public void fillEmail(){
        wait.until(driver -> driver.findElement(emailInput).isDisplayed());
        localDriver.findElement(emailInput).sendKeys("trydilek23@gmail.com");

    }

    public void fillPassword(){
        wait.until(driver -> driver.findElement(passwordInput).isDisplayed());
        localDriver.findElement(passwordInput).sendKeys("Tryeb2323.");
    }

    public void buttonClick() {
        wait.until(driver -> driver.findElement(twoLoginButton).isDisplayed());
        localDriver.findElement(twoLoginButton).click();

    }
    public void loginsucces() {
        wait.until(driver -> driver.findElement(succesLogin).isDisplayed());
        Assert.assertEquals(localDriver.findElement(succesLogin).getText(),"Giriş başarılı");
    }
    public void negativeFillEmail(){
        wait.until(driver -> driver.findElement(emailInput).isDisplayed());
        localDriver.findElement(emailInput).sendKeys("trydilek23gmail.com");
    }
    public void negativeFillPassword(){
        wait.until(driver -> driver.findElement(passwordInput).isDisplayed());
        localDriver.findElement(passwordInput).sendKeys("tryeb2323");
    }


    public void getErrorMessage(){
        wait.until(driver -> driver.findElement(errorMessage).isDisplayed());
        Assert.assertFalse(localDriver.findElement(errorMessage).getText().contains("Giriş başarılı"),"giriş başarısız");
        //return localDriver.findElement(errorMessage).getText();

    }

}
