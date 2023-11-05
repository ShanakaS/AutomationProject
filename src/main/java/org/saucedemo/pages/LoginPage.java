package org.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.saucedemo.base.TestBase;


public class LoginPage extends TestBase {

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginbutton;



    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void InvalidUserNamewithInvalidPasswordlogin(WebDriver driver,String invalidusername, String invalidpassword) throws InterruptedException {
       // waitForElement(driver,By.id("user-name"),120);
       // driver.findElement(By.id("user-name")).sendKeys(invalidusername);
        username.sendKeys(invalidusername);
        password.sendKeys(invalidpassword);
        loginbutton.click();
        username.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        username.clear();
        password.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        password.clear();




      //  driver.findElement(By.id("password")).sendKeys(invalidpassword);
    /*    driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("user-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("password")).clear();
        */

    }
   public void InvalidUserNamewithvalidPasswordlogin(WebDriver driver,String invalidusername, String validpassword) throws InterruptedException {
       Thread.sleep(2000);
       username.sendKeys(Keys.chord(Keys.CONTROL, "a"));
       username.clear();
       password.sendKeys(Keys.chord(Keys.CONTROL, "a"));
       password.clear();
       username.sendKeys(invalidusername);
       password.sendKeys(validpassword);
       loginbutton.click();
       username.sendKeys(Keys.chord(Keys.CONTROL, "a"));
       username.clear();
       password.sendKeys(Keys.chord(Keys.CONTROL, "a"));
       password.clear();

    }
    public void validUserNamewithInvalidPasswordlogin(WebDriver driver,String validusername, String invalidpassword) throws InterruptedException {
        Thread.sleep(2000);
        Thread.sleep(2000);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        username.clear();
        password.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        password.clear();
        username.sendKeys(validusername);
        password.sendKeys(invalidpassword);
        loginbutton.click();
    }

    public boolean validUserNamewithvalidPasswordlogin(WebDriver driver,String validusername, String validpassword) throws InterruptedException {
        Thread.sleep(2000);
        username.sendKeys(validusername);
        password.sendKeys(validpassword);
        loginbutton.click();
        if(driver.getCurrentUrl().endsWith("inventory.html"))
        {
            return true;
        }
        else
            return false;

    }

    public void Logout(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();

    }

    public boolean getErrorMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3")).isDisplayed();
    }


}
