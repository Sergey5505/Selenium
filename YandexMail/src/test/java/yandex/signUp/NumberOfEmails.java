package yandex.signUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NumberOfEmails {

    private int size;
    private WebDriver driver;

    public NumberOfEmails(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[text()='Simbirsoft Тестовое задание']")
    private List<WebElement> countSize;

    public int sizeEmail() {
        List<WebElement> elements = countSize;
        size = elements.size();
        return size;
    }
}
