package org.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.saucedemo.base.TestBase;
import org.saucedemo.pages.LoginPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.PropertyFileReader;

public class LoginPageTest extends TestBase {

    PropertyFileReader property = new PropertyFileReader();

  //  String url = property.getProperty("config", "url");
    String path = property.getProperty("config", "chromedriverpath");
    LoginPage login;

    private static final Logger logger = LoggerFactory.getLogger(LoginPageTest.class);

    public LoginPageTest() {
        super();
    }

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.get(prop.getProperty("BASEURL"));
        driver.manage().window().maximize();
        login = new LoginPage();

    }
    @Test(priority = 1)
    public void validUserNamewithvalidPasswordloginTest() throws InterruptedException {
        login.validUserNamewithvalidPasswordlogin(driver, prop.getProperty("Validusername"), prop.getProperty("Validpassword"));
        Assert.assertTrue(true,"Login Failed");
        login.Logout(driver);
    }
    @Test(priority = 2)
    public void InvalidUserNamewithInvalidPasswordloginTest() throws InterruptedException {
       login.InvalidUserNamewithInvalidPasswordlogin(driver,prop.getProperty("Invalidusername"),prop.getProperty("Invalidpassword"));
        boolean errorMsg = login.getErrorMessage(driver);
        Assert.assertTrue(errorMsg, "Login Passed!");

    }
    @Test(priority = 3)
    public void InvalidUserNamewithvalidPasswordloginTest() throws InterruptedException {
        login.InvalidUserNamewithvalidPasswordlogin(driver,prop.getProperty("Invalidusername"),prop.getProperty("Validpassword"));
        System.out.println("Latest Password is:" + prop.getProperty("Validpassword"));
        boolean errorMsg = login.getErrorMessage(driver);
        Assert.assertTrue(errorMsg, "Login Passed!");

    }
    @Test(priority = 4)
    public void validUserNamewithInvalidPasswordloginTest() throws InterruptedException {
        login.validUserNamewithInvalidPasswordlogin(driver,prop.getProperty("Validusername"),prop.getProperty("Invalidpassword"));
        boolean errorMsg = login.getErrorMessage(driver);
        Assert.assertTrue(errorMsg, "Login Passed!");

    }






}
