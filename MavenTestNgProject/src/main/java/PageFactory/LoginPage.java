package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

        @FindBy(linkText = "Login")
        private WebElement login;

        @FindBy(name = "spree_user[email]")
        private WebElement emailTextBox;

        @FindBy(id = "spree_user_password")
        private  WebElement passwordTextBox;

        @FindBy(css = "input[value='Login']")
        private WebElement loginButton;



        public LoginPage(WebDriver driver){
            PageFactory.initElements(driver,this);

        }


    public void login(String email, String password){
            login.click();
            emailTextBox.sendKeys(email);
            passwordTextBox.sendKeys(password);
            loginButton.click();
        }



}
