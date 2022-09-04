package com.vildanova.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class AddProductToCardPage {

    private SelenideElement
            menu = $(".header__burger-icon"),
            subcategory = $(By.xpath("//*[text() = 'Топы']")),
            category = $$(".js-header-sub-menu-open").get(0),
            product = $(By.xpath("//div[@id='products_list']/ul/li[1]")),
            buttonToAdd = $(".single_add_to_cart_button"),
            card = $(".header__user-menu-item"),
            oneProduct = $(".cart-label__item");

    @Step("Нажать на кнопку Меню - бургер")
    public AddProductToCardPage openMenu() {
        menu.click();
        return this;
    }

    @Step("Выбрать категорию в меню")
    public AddProductToCardPage chooseCategory() {
        category.click();
        return this;
    }

    @Step("Выбрать подкатегорию в выбранной категории")
    public AddProductToCardPage chooseSubcategory() {
        subcategory.click();
        return this;
    }

    @Step("Выбрать товар")
    public AddProductToCardPage chooseProduct() {
        product.click();
        return this;
    }

    @Step("Добавить товар в корзину")
    public AddProductToCardPage addToCard() {
        buttonToAdd.click();
        return this;
    }

    @Step("Перейти в корзину")
    public AddProductToCardPage goToCard() {
        card.click();
        return this;
    }

    @Step("Проверить наличие одного товара в корзине ")
    public void checkHeading() {
        String expectedTitle = "Товары, 1 шт.";
        String actualTitle = oneProduct.getText();
        assertThat(actualTitle).contains(expectedTitle);
    }
}
