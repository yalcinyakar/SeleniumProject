package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTests;

import java.util.concurrent.TimeUnit;

public class ProfilePageObjects extends BasePageObjects {
    public ProfilePageObjects(WebDriver driver) {

        this.driver= driver;
    }
   //  By bookstore_button = By.id("gotoStore");
    By logout_button = By.id("submit");
    By bookstore_item =By.id("see-book-Git Pocket Guide");
    By book_delete_item = By.id("delete-record-undefined");
    By confirm_delete_button =By.id("closeSmallModal-ok");


    public void clickLogoutButton(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(logout_button).click();
    }

    public void clickBookStoreItem(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(bookstore_item).click();
    }
    public void clickBookDeleteItem(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(book_delete_item).click();
    }

}
