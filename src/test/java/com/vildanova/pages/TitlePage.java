package com.vildanova.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class TitlePage {

    @Step("Проверить заголовок сайта https://www.sela.ru/")
    public void checkTitle(String title) {
        String expectedTitle = title;
        String actualTitle = title();
        assertThat(actualTitle).isNotEqualTo(expectedTitle);
    }
}
