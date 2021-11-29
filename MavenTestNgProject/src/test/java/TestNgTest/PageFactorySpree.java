package TestNgTest;

import PageFactory.*;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageFactorySpree {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/suchismitapal/IdeaProjects/MavenTestNgProject/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
    }

    @Test
    public void ShouldPlaceOrder() {
        LoginPage userLogin = new LoginPage(driver);
        userLogin.login("suchi1@test.com", "12345678");

        PageFactoryHomePage homePage = new PageFactoryHomePage(driver);
        homePage.verifyLandingPage();


        PageFactoryCategoryPage categoryPage = new PageFactoryCategoryPage(driver);
        categoryPage.selectProduct();

        PageFactoryProductPage productPage = new PageFactoryProductPage(driver);
        productPage.addProductToCart("2");

        PageFactoryCartPage cartPage = new PageFactoryCartPage(driver);
        cartPage.clickCheckOut();


    }


    @AfterMethod

    public void closesTheSites() {
        driver.quit();

    }
}

