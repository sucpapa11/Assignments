package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;

public class PageFactoryHomePage {
    @FindBy(css=".alert.alert-success")
    private WebElement getWelcomeMessage;

    WebDriverWait wait;
        public PageFactoryHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10000);
    }


    public void verifyLandingPage(){
            Assert.assertEquals(getWelcomeMessage.getText(), "Logged in successfully");
        }
    }


