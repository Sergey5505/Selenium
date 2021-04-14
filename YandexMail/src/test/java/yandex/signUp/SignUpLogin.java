package yandex.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpLogin {

    private String login = "sergtest21";
    private WebDriver driver;
    private WebDriverWait wait;

    public String getLogin() {
        return login;
    }

    public SignUpLogin(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openLogin(){
        driver.get("https://passport.yandex.ru/auth?origin=home_desktop_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fyandex.ru");
    }

    public void startedLogin(){
        driver.findElement(By.cssSelector("[data-t=\"field:input-login\"]")).sendKeys(getLogin());
        driver.findElement(By.cssSelector("[data-t=\"button:action\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Войдите, чтобы продолжить']")));
    }
}
