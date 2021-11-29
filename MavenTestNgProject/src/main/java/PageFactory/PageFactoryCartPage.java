package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageFactoryCartPage {

    @FindBy(css = "[data-hook='cart_item_total']")
    private WebElement cartTotal;
    @FindBy(id="checkout-link")
    private WebElement checkOutBtn;
    @FindBy(className = "glyphicon glyphicon-minus-sign")
    private WebElement deletePdt;

    public PageFactoryCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getCartValue() {
        String cartTotalValue = cartTotal.getText();
        return cartTotalValue;
    }
    public void clickCheckOut(){
        checkOutBtn.click();
    }
    public void deleteProduct(){
        deletePdt.click();
    }
}

