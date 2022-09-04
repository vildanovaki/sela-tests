package com.vildanova.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class FavoritePage {

    private SelenideElement
            buttonOfFavorite = $("#header_user_menu_favorite_link"),
            emptyFavorite = $(".title");

    @Step("Открыть страницу Избранное")
    public FavoritePage openFavorite() {
        buttonOfFavorite.click();
        return this;
    }

    @Step("Проверить заголовок пустой страницы Избранное")
    public void checkEmptyFavorites() {
        String expectedTitle = "Сейчас у вас ничего нет в «Избранном»";
        String actualTitle = emptyFavorite.getText();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
