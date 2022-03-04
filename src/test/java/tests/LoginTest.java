package tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import pageobjects.LoginPageObjects;


public class LoginTest extends BaseTests {
/*
Expecting user name correctly shown in profile page
 */
    @Test
    public void simpleLoginTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("yalcin");
        loginPageObjects.setTextIntoPasswordTextBox("123456Aa!");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.get_actual_username(),"yalcin");
    }

    /*
    Expecting to return the error message correctly after a wrong password input
     */
    @Test
    public void simpleInvalidLoginTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("yalcin");
        loginPageObjects.setTextIntoPasswordTextBox("123456");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.getActualErrorMessage(),"Invalid username or password!");
    }
}
