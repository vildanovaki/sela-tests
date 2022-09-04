package com.vildanova.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    private SelenideElement
            form = $("#header_user_menu_registration_link"),
            login = $(".js-email-input"),
            password = $("#password-enter"),
            submit = $("[type=submit]"),
            profile = $(".title__h1"),
            passwordError = $(".js-password-error"),
            logout = $(By.xpath("//*[text() = 'Выйти']"));

    @Step("Открыть форму авторизации")
    public AuthorizationPage openFormOfAuthorization() {
        form.click();
        return this;
    }

    @Step("Ввести логин")
    public AuthorizationPage enterLogin(String valueOfLogin) {
        login.setValue(valueOfLogin);
        return this;
    }

    @Step("Ввести пароль")
    public AuthorizationPage enterPassword(String valueOfPassword) {
        password.setValue(valueOfPassword);
        return this;
    }

    @Step("Нажать на кнопку Войти")
    public AuthorizationPage enter() {
        submit.click();
        return this;
    }

    @Step("Проверить умпешную авторизацию")
    public void checkValidAuthorization() {
        profile.shouldHave(text("Личный кабинет"));
    }

    @Step("Выйти с личного кабинета")
    public void logout() {
        logout.click();
    }

    @Step("Проверить обязательность поля Логина")
    public void checkEmptyLoginOfAuthorization() {
        login.shouldHave(attribute("required"));
    }

    @Step("Проверить обязательность поля Пароль")
    public void checkEmptyPasswordOfAuthorization() {
        password.shouldHave(attribute("required"));
    }

    @Step("Проверить вывод сообщения при вводе неверного логина или пароля")
    public void checkWrongLoginOrPasswordOfAuthorization() {
        passwordError.shouldHave(text("Неправильное имя пользователя или пароль."));
    }
}
