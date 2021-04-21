package yandex.signUp;

import org.junit.Test;
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
        SignUpLogin signUpLogin = new SignUpLogin(driver);
        signUpLogin.openLogin(site);
        signUpLogin.startedLogin(loginUpLogin);

        SignUpPassword signUpPassword = new SignUpPassword(driver);
        signUpPassword.startedPassword(passwordSignUpPassword);

        NumberOfEmails numberOfEmails = new NumberOfEmails(driver);
        size = numberOfEmails.sizeEmail();

        SendEmail sendEmail = new SendEmail(driver);
        sendEmail.pushEmail(size, loginSendEmail, nameSendEmail);
    }
}
