package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryProductPage {
    @FindBy(id="quantity")
    private WebElement quantityTextBox;

    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    public PageFactoryProductPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void addProductToCart(String quantity){

        quantityTextBox.clear();
        quantityTextBox.sendKeys(quantity);
        addToCartButton.click();
    }
}
