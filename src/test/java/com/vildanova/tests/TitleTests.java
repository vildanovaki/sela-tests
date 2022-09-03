package com.vildanova.tests;

import com.vildanova.pages.OpenPage;
import com.vildanova.pages.TitlePage;
import io.qameta.allure.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TitleTests extends TestBase {

    OpenPage openPage = new OpenPage();
    TitlePage titlePage = new TitlePage();

    @ValueSource(strings = {
            "Sela – интернет-магазин одежды для женщин и детей от 2 до 12 лет",
            "Sela – интернет-магазин",
            "Sela"
    })
    @ParameterizedTest(name = "Check title of site")
    @Feature("Title")
    @Story("Test number one")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.TRIVIAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Проверить заголовок сайта.")
    void titleTest(String title) {
        openPage
                .openPage()
                .chooseCity();

        titlePage
                .checkTitle(title);
    }
}
