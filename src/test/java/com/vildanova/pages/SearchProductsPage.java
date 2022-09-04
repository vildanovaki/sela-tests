package com.vildanova.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchProductsPage {

    private SelenideElement
            search = $("#header_user_menu_search_link"),
            input = $(".digi-search-form__input"),
            firstProduct = (SelenideElement) $$(".digi-product").get(1);

    @Step("Выбрать кнопку поиска")
    public SearchProductsPage clickSearchElement() {
        search.click();
        return this;
    }

    @Step("Ввести значение в поле поиска")
    public SearchProductsPage searchProducts(String product) {
        input.setValue(product);
        return this;
    }

    @Step("Проверить вывод совпадений со значением, введенного в поле поиска")
    public void checkSearchProduct(String product) {
        firstProduct.shouldHave(Condition.text(product));
    }
}
