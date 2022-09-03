package com.vildanova.pages;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class OpenPage {

    @Step("Открыть url https://www.sela.ru/")
    public OpenPage openPage() {
        open("https://www.sela.ru/");
        return this;
    }

    @Step("Выбрать город по умолчанию")
    public void chooseCity() {
        if($(By.xpath("//*[text() = 'Да, все верно']")).isDisplayed())
            $(By.xpath("//*[text() = 'Да, все верно']")).click();
    }
}
