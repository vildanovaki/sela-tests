package com.vildanova.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckTitleOfPage {

    private SelenideElement
            menu = $(".header__burger-icon"),
            subcategory = $(By.xpath("//*[text() = 'Топы']")),
            category = $$(".js-header-sub-menu-open").get(0);

    @Step("Нажать на кнопку Меню - бургер")
    public CheckTitleOfPage openMenu() {
        menu.click();
        return this;
    }

    @Step("Выбрать категорию в меню")
    public CheckTitleOfPage chooseCategory() {
        category.click();
        return this;
    }

    @Step("Выбрать подкатегорию в выбранной категории")
    public CheckTitleOfPage chooseSubcategory() {
        subcategory.click();
        return this;
    }

    @Step("Проверить заголовок страницы, выбранной категории")
    public void checkTitleOfPage() {
        String expectedTitle = "Женские топы и майки";
        String actualTitle = $(".page-title").getText();
        System.out.println(actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
