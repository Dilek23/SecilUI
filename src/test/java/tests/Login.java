package tests;

import base.BaseTest;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPopup;
import pages.Search;

import java.sql.Driver;

public class Login extends BaseTest {


    @Test(
            description = "User should be able to login with valid credentials"
    )
    public void positiveLogin(){

   LoginPopup login= new LoginPopup(driver);
     login.clickLogin();
     login.fillEmail();
     login.fillPassword();
     login.buttonClick();
     login.loginsucces();

    }

    @Test(
            description = "User should see related error message on attempt to login with invalid credentials"
    )
    public void negativeLogin(){
        LoginPopup ngtvEmail= new LoginPopup(driver);
        ngtvEmail.clickLogin();
        ngtvEmail.negativeFillEmail();
        ngtvEmail.fillPassword();
        ngtvEmail.buttonClick();
        ngtvEmail.getErrorMessage();

    }
    @Test
    public void negativeLoginPassword(){
        LoginPopup ngtvPassword= new LoginPopup(driver);
       ngtvPassword.clickLogin();
       ngtvPassword.fillEmail();
       ngtvPassword.negativeFillPassword();
       ngtvPassword.buttonClick();
       ngtvPassword.getErrorMessage();

    }
   @Test
    public void searchBox(){
        Search search=new Search(driver);
        search.beLogin();
        search.searchClick();


    }


}
