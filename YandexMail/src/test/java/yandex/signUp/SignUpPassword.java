package yandex.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPassword {

    private String password = "sergqwerty";
    private WebDriver driver;
    private WebDriverWait wait;

    public String getPassword() {
        return password;
    }

    public SignUpPassword(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void startedPassword(){
        driver.findElement(By.cssSelector("[data-t=\"field:input-passwd\"]")).sendKeys(getPassword());
        driver.findElement(By.cssSelector("[data-t=\"button:action\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Написать']")));
    }
}