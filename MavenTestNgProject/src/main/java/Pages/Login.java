package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {


    public void login(WebDriver driver,String userMailId,String password){

        driver.findElement(By.id("link-to-login")).click();
        WebElement emailTextBox = driver.findElement(By.id("spree_user_email"));
        emailTextBox.sendKeys(userMailId);
        WebElement passwordTextBox=driver.findElement(By.id("spree_user_password"));
        passwordTextBox.sendKeys(password);
        driver.findElement(By.name("commit")).click();
    }
}
