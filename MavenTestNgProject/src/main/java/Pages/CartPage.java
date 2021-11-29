package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CartPage {
    public void validateCartPage(WebDriver driver, String expectedval){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String total = driver.findElement(By.cssSelector("td[class='lead']")).getText();
        System.out.println("Total:" + total);
        Assert.assertTrue(total.equals(expectedval));
    }


}
