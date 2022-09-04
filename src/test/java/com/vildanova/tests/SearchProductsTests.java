package com.vildanova.tests;

import com.vildanova.pages.OpenPage;
import com.vildanova.pages.SearchProductsPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.vildanova.tests.TestData.dress;

public class SearchProductsTests extends TestBase {

    OpenPage openPage = new OpenPage();
    SearchProductsPage searchProductsPage = new SearchProductsPage();

    @Test
    @Tag("Title")
    @AllureId("12080")
    @DisplayName("Search a product")
    @Feature("Title")
    @Story("Test number one")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Нажать на иконку поиска \n" +
            "4) Ввести в поле поиска значение \n" +
            "5) Проверить вывод совпадений по введенным значениям в поле поиска.")
    void searchProductTest() {
        openPage
                .openPage()
                .chooseCity();

        searchProductsPage
                .clickSearchElement()
                .searchProducts(dress)
                .checkSearchProduct(dress);
    }
}
