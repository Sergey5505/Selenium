package yandex.signUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPassword {

    private WebDriver driver;

    public SignUpPassword(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "[data-t=\"field:input-passwd\"]")
    private WebElement namePassword;

    @FindBy(css = "[data-t=\"button:action\"]")
    private WebElement buttonPassword;

    public void startedPassword(String passwordSignUpPassword) {
        namePassword.sendKeys(passwordSignUpPassword);
        buttonPassword.click();
    }
}