package com.vildanova.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.vildanova.tests.TestBase.credentials;

public class AuthorizationPage {

    private SelenideElement
            form=$("#header_user_menu_registration_link"),
            login = $(".js-email-input"),
            password=$("#password-enter"),
            submit=$("[type=submit]"),
            profile=$(".title__h1");

    public void openPage() {
        open("https://www.sela.ru/");
        $("[text=Да, все верно]").click();
    }

    public AuthorizationPage openFormOfAuthorization() {
        form.click();
        return this;
    }

    public AuthorizationPage enterLogin(){
        login.setValue(credentials.login());
        return this;
    }

    public AuthorizationPage enterPassword(){
        password.setValue(credentials.password());
        return this;
    }

    public AuthorizationPage enter(){
        submit.click();
        return this;
    }

    public void checkValidAuthorization(){
        profile.shouldHave(text("Личный кабинет"));
    }
}
