package PageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopLoginPage extends BasePage {

    public WebDriver driver;

    By email = By.cssSelector("section input[name='email']");
    By password = By.cssSelector("input[name='password']");
    By loginBtn = By.cssSelector("button#submit-login");

    public ShopLoginPage() throws IOException {
        super();
    }


    public WebElement getEmail() throws IOException {
        this.driver = getDriver();
        return driver.findElement(email);
    }


    public WebElement getPassword() throws IOException {
        this.driver = getDriver();
        return driver.findElement(password);
    }


    public WebElement getLoginBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(loginBtn);
    }
}
