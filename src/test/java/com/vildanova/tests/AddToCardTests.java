package com.vildanova.tests;

import com.vildanova.pages.AddProductToCardPage;
import com.vildanova.pages.OpenPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class AddToCardTests {

    OpenPage openPage = new OpenPage();
    AddProductToCardPage addProductToCardPage = new AddProductToCardPage();

    @Test
    @Feature("Add product")
    @Story("Test number one")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Нажать на меню \n" +
            "4) Выбрать категорию \n" +
            "5) Выбрать подкатегорию \n" +
            "6) Выбрать первый продукт\n" +
            "7) Нажать на кнопку Добавить в корзину\n" +
            "8) Перейти в корзину\n" +
            "9) Проверить заголовк Корзины на наличие одного товара.")
    void addProductToCardTest() {
        openPage
                .openPage()
                .chooseCity();

        addProductToCardPage
                .openMenu()
                .chooseCategory()
                .chooseSubcategory()
                .chooseProduct()
                .addToCard()
                .goToCard()
                .checkHeading();
    }
}