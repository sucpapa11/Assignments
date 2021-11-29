package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryCategoryPage {


        @FindBy(linkText = "Bags")
        private WebElement bagsCategory;

        @FindBy(css = "span[title='Ruby on Rails Tote']")
        private WebElement bagsProduct;

        // WebDriverWait wait;
        public PageFactoryCategoryPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            //wait = new WebDriverWait(driver,20000);
        }

        public void selectProduct() {
            bagsCategory.click();
            // wait.until(ExpectedConditions.visibilityOf(bagsProduct));
            bagsProduct.click();
        }
    }

