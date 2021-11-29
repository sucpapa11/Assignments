package TestNgTest;

import Pages.*;
//import jdk.jfr.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SpreeDemo {
    WebDriver driver;

    @BeforeMethod
    public void method1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/suchismitapal/IdeaProjects/MavenTestNgProject/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
    }

    @Test

    public void pageObject(){
        Login userLogin=new Login();
        userLogin.login(driver,"suchi1@test.com","12345678");

        HomePage homePage = new HomePage();
        homePage.verifyHomePage(driver);

        CategoryPage categoryPage=new CategoryPage();
        categoryPage.selectCategory(driver);

        ProductPage productPage=new ProductPage();
        productPage.addProductToCart(driver);

        CartPage cartPage = new CartPage();
        cartPage.validateCartPage(driver,"$33.58");





    }

  /*  @Test
    public void method2() {

       // WebDriver driver = new ChromeDriver();
       // driver.get("https://spree-vapasi-prod.herokuapp.com/login");

        driver.findElement(By.id("spree_user_email")).sendKeys("suchi1@test.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[type=checkbox]")).click();
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement dropDown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropDown);
        select.selectByValue("1");
        driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();

        driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("2");

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String total = driver.findElement(By.cssSelector("td[class='lead']")).getText();
        System.out.println("Total:" + total);

    }
*/
    @AfterMethod


    public void closeTheSites() {
       driver.quit();


    }
    }
