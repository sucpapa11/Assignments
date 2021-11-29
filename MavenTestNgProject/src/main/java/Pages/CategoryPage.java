package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CategoryPage {
    public void selectCategory(WebDriver driver){
        WebElement dropDown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropDown);
        select.selectByValue("1");
        driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();

        driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();

    }
}
