package yandex.signUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendEmail {

    private WebDriver driver;

    public SendEmail(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "mail-ComposeButton-Text")
    private WebElement buttonWrite;

    @FindBy(css = "[data-class-bubble=\"yabble-compose js-yabble\"]")
    private WebElement toWhom;

    @FindBy(xpath = "//input[@class='composeTextField ComposeSubject-TextField']")
    private WebElement topic;

    @FindBy(xpath = "//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder']//br")
    private WebElement messageBody;

    @FindBy(xpath = "//button[@class='control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action']")
    private WebElement buttonSend;

    public void pushEmail(int size, String loginSendEmail, String nameSendEmail) {
        buttonWrite.click();
        toWhom.sendKeys(loginSendEmail);
        topic.sendKeys("Simbirsoft Тестовое задание. " + nameSendEmail);
        messageBody.sendKeys("Количество писем: " + size);
        buttonSend.click();
    }
}