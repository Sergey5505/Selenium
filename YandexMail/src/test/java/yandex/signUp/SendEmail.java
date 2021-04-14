package yandex.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendEmail {
    private String name = "Иванов";
    private String login = "sergtest21@yandex.ru";
    private WebDriver driver;
    private WebDriverWait wait;

    public String getName() {
        return name;
    }
    public String getLogin() {
        return login;
    }

    public SendEmail(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void pushEmail(int size){
        driver.findElement(By.className("mail-ComposeButton-Text")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Кому']")));

        driver.findElement(By.cssSelector("[data-class-bubble=\"yabble-compose js-yabble\"]")).sendKeys(getLogin());
        driver.findElement(By.xpath("//input[@class='composeTextField ComposeSubject-TextField']")).sendKeys("Simbirsoft Тестовое задание. " + getName());
        driver.findElement(By.xpath("//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder']//br")).sendKeys("Количество писем: " + size);
        driver.findElement(By.xpath("//button[@class='control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action']")).click();
    }
}