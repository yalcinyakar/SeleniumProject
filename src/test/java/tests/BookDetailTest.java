package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPageObjects;
import pageobjects.ProfilePageObjects;

public class BookDetailTest extends BaseTests {
/*
Expecting user click on a book and able to see the details properly after a successful login
 */
    @Test
    public void BookDetailTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("yalcin");
        loginPageObjects.setTextIntoPasswordTextBox("123456Aa!");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.get_actual_username(),"yalcin");
        ProfilePageObjects profilePageObjects =new ProfilePageObjects(driver);
        profilePageObjects.clickBookStoreItem();
    }
    @Test

    /*
    Expecting user to see the acceptance modal for deleting a book after a succesfull login
     */
    public void BookDeleteTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("yalcin");
        loginPageObjects.setTextIntoPasswordTextBox("123456Aa!");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.get_actual_username(),"yalcin");
        ProfilePageObjects profilePageObjects =new ProfilePageObjects(driver);
        profilePageObjects.clickBookDeleteItem();

    }

}
