package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage {

    public HomePage(WebDriver driver) {
    }

    public HomePage() {

    }

    public void verifyHomePage(WebDriver driver){
        String welcomeMessageAlert=driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText();
        System.out.println(welcomeMessageAlert);
        Assert.assertTrue(welcomeMessageAlert.equals("Logged in successfully"));


    }
}
