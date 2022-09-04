package com.vildanova.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenPage {

    private SelenideElement
            trueCity = $(By.xpath("//*[text() = 'Да, все верно']"));

    @Step("Открыть url https://www.sela.ru/")
    public OpenPage openPage() {
        open("https://www.sela.ru/");
        return this;
    }

    @Step("Выбрать город по умолчанию")
    public void chooseCity() {
        if (trueCity.isDisplayed())
            trueCity.click();
    }
}
