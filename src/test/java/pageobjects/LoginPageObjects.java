package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageObjects extends BasePageObjects{
 public LoginPageObjects(WebDriver driver) {

     this.driver= driver;
 }

    By username_text_box =By.id("userName");

    By password_text_box =By.id("password");

    By login_button = By.id("login");

    By username_value_label = By.id("userName-value");

    By error_message= By.id("name");
    String actual_username_value_label;

    String actual_error_message;



    public void setTextIntoLoginTextBox(String text){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(username_text_box).sendKeys(text);
    }
    public void setTextIntoPasswordTextBox(String text){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(password_text_box).sendKeys(text);
    }

    public void clickLoginButton(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(login_button).click();
    }

    public String get_actual_username(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        actual_username_value_label= driver.findElement(username_value_label).getText();
        return actual_username_value_label;
    }
    public String getActualErrorMessage(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        actual_error_message= driver.findElement(error_message).getText();
        return actual_error_message;
    }

}
