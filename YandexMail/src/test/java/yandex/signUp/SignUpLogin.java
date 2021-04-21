package yandex.signUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLogin {

    private WebDriver driver;

    public SignUpLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "[data-t=\"field:input-login\"]")
    private WebElement nameLogin;

    @FindBy(css = "[data-t=\"button:action\"]")
    private WebElement buttonLogin;

    public void openLogin(String site) {
        driver.get(site);
    }

    public void startedLogin(String loginUpLogin) {
        nameLogin.sendKeys(loginUpLogin);
        buttonLogin.click();
    }
}
