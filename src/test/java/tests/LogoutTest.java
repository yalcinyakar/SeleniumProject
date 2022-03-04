package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPageObjects;
import pageobjects.ProfilePageObjects;

public class LogoutTest extends BaseTests{
/*
Expecting user to be able to log out after a successful login
 */
    @Test
    public void LogoutTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("yalcin");
        loginPageObjects.setTextIntoPasswordTextBox("123456Aa!");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.get_actual_username(),"yalcin");
        ProfilePageObjects profilePageObjects =new ProfilePageObjects(driver);
        profilePageObjects.clickLogoutButton();
    }
}
