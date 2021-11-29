package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    public void addProductToCart(WebDriver driver){
        driver.findElement(By.id("quantity")).clear();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("quantity")).sendKeys("2");

        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
