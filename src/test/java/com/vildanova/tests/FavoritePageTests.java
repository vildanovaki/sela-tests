package com.vildanova.tests;

import com.vildanova.pages.CheckTitleOfPage;
import com.vildanova.pages.FavoritePage;
import com.vildanova.pages.OpenPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class FavoritePageTests {

    OpenPage openPage = new OpenPage();
    FavoritePage favoritePage = new FavoritePage();

    @Test
    @Feature("Title")
    @Story("Test number one")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.TRIVIAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть страницу Избранное \n" +
            "4) Проверить заголовок об отсутствии товаров на странице.")
    void checkTitleOfPageTest() {
        openPage
                .openPage()
                .chooseCity();

        favoritePage
                .openFavorite()
                .checkEmptyFavorites();
    }
}
