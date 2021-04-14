package yandex.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NumberOfEmails {

    private int size;
    private WebDriver driver;

    public NumberOfEmails(WebDriver driver){
        this.driver = driver;
    }

    public int sizeEmail() {
        List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Simbirsoft Тестовое задание']"));
        size = elements.size();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }
}
