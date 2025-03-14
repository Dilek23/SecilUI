package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends BasePage{


    public Search(WebDriver driver) {
        super(driver);
    }
    protected By searcButton=By.xpath("(//div/input)[4]");
    protected By emailInput = By.name("email");
    protected By passwordInput = By.name("password");
    protected By loginButton = By.xpath("(//li/a)[5]");
    protected By twoLoginButton=By.xpath("(//div/button)[4]");
    protected By titleEtek=By.xpath("//div[@class='p-2 bg-base-300 rounded cursor-pointer']");
    protected By acceptCerez=By.xpath("//button[text()='Kabul Et']");

    public void beLogin(){
        localDriver.get("https://www.secilstore.com/");
        localDriver.findElement(loginButton).click();
        wait.until(driver -> driver.findElement(loginButton).isDisplayed());
        wait.until(driver -> driver.findElement(emailInput).isDisplayed());
        localDriver.findElement(emailInput).sendKeys("trydilek23@gmail.com");
        wait.until(driver -> driver.findElement(passwordInput).isDisplayed());
        localDriver.findElement(passwordInput).sendKeys("Tryeb2323.");
        wait.until(driver -> driver.findElement(twoLoginButton).isDisplayed());
        localDriver.findElement(twoLoginButton).click();

    }
   public void searchClick(){
       Actions actions=new Actions(localDriver);
       actions.moveToElement((WebElement) acceptCerez).perform();
       ((WebElement) acceptCerez).click();
       wait.until(driver -> driver.findElement(searcButton).isDisplayed());
     localDriver.findElement(searcButton).sendKeys("Etek");

      // Assert.assertEquals(localDriver.findElement(titleEtek),"Etek & Şort");


   }





}
