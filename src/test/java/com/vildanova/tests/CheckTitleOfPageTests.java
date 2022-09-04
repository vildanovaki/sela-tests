package com.vildanova.tests;

import com.vildanova.pages.CheckTitleOfPage;
import com.vildanova.pages.OpenPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CheckTitleOfPageTests extends TestBase {

    OpenPage openPage = new OpenPage();
    CheckTitleOfPage checkTitleOfPage = new CheckTitleOfPage();

    @Test
    @Tag("Title")
    @AllureId("12083")
    @DisplayName("Check title of page with choosing subcategory")
    @Feature("Title")
    @Story("Test number one")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.TRIVIAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Нажать на меню \n" +
            "4) Выбрать категорию\n" +
            "5) Выбрать подкатегорию\n" +
            "6) Проверить заголовок страницы выбранной категории.")
    void checkTitleOfPageTest() {
        openPage
                .openPage()
                .chooseCity();

        checkTitleOfPage
                .openMenu()
                .chooseCategory()
                .chooseSubcategory()
                .checkTitleOfPage();
    }
}
