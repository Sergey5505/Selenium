package yandex.signUp;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import yandex.WebDriverSettings;

public class YandexMail extends WebDriverSettings {

    private String site = "https://passport.yandex.ru/auth?origin=home_desktop_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fyandex.ru";
    private String loginUpLogin = "sergtest21";
    private String passwordSignUpPassword = "sergqwerty";
    private int size;
    private String loginSendEmail = "sergtest21@yandex.ru";
    private String nameSendEmail = "Иванов";

    @Test
    public void signUp() {
        SignUpLogin signUpLogin = PageFactory.initElements(driver, SignUpLogin.class);
        signUpLogin.openLogin(site);
        signUpLogin.startedLogin(loginUpLogin);

        SignUpPassword signUpPassword = PageFactory.initElements(driver, SignUpPassword.class);
        signUpPassword.startedPassword(passwordSignUpPassword);

        NumberOfEmails numberOfEmails = PageFactory.initElements(driver, NumberOfEmails.class);
        size = numberOfEmails.sizeEmail();

        SendEmail sendEmail = PageFactory.initElements(driver, SendEmail.class);
        sendEmail.pushEmail(size, loginSendEmail, nameSendEmail);
    }
}
