package yandex.signUp;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import yandex.WebDriverSettings;

public class YandexMail extends WebDriverSettings {

    @Test
    public void signUp(){

        SignUpLogin signUpLogin = PageFactory.initElements(driver, SignUpLogin.class);
        signUpLogin.openLogin();
        signUpLogin.startedLogin();

        SignUpPassword signUpPassword = PageFactory.initElements(driver, SignUpPassword.class);
        signUpPassword.startedPassword();

        NumberOfEmails numberOfEmails = PageFactory.initElements(driver, NumberOfEmails.class);
        int size = numberOfEmails.sizeEmail();

        SendEmail sendEmail = PageFactory.initElements(driver, SendEmail.class);
        sendEmail.pushEmail(size);
    }
}
