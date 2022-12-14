package com.vildanova.tests;

import com.vildanova.pages.AuthorizationPage;
import com.vildanova.pages.OpenPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.vildanova.tests.TestData.firstPasswordFaker;
import static com.vildanova.tests.TestData.secondPasswordFaker;

public class AuthorizationTests extends TestBase {

    OpenPage openPage = new OpenPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();

    @Test
    @Tag("Authorization")
    @AllureId("12074")
    @DisplayName("Valid authorization")
    @Feature("Authorization")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть форму авторизации \n" +
            "4) Ввести верный логин\n" +
            "5) Ввести верный пароль\n" +
            "6) Нажать на кнопку Войти\n" +
            "7) Проверить переход в личный кабинет\n" +
            "8) Выйти с личного кабинета")
    void validAuthorizationTest() {
        openPage
                .openPage()
                .chooseCity();

        authorizationPage
                .openFormOfAuthorization()
                .enterLogin(credentials.trueLogin())
                .enterPassword(credentials.truePassword())
                .enter()
                .checkValidAuthorization()
                .logout();
    }

    @Test
    @Tag("Authorization")
    @AllureId("12076")
    @DisplayName("Check required of login")
    @Feature("Authorization")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть форму авторизации \n" +
            "4) Проверить обязательность атрибуда в поле логин.")
    void emptyLoginTest() {
        openPage
                .openPage()
                .chooseCity();

        authorizationPage
                .openFormOfAuthorization()
                .checkEmptyLoginOfAuthorization();
    }

    @Test
    @Tag("Authorization")
    @AllureId("12078")
    @DisplayName("Check required of password")
    @Feature("Authorization")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть форму авторизации \n" +
            "4) Проверить обязательность атрибуда в поле пароля.")
    void emptyPasswordTest() {
        openPage
                .openPage()
                .chooseCity();

        authorizationPage
                .openFormOfAuthorization()
                .checkEmptyPasswordOfAuthorization();
    }

    @Test
    @Tag("Authorization")
    @AllureId("12075")
    @DisplayName("Invalid authorization with wrong login")
    @Feature("Authorization")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть форму авторизации \n" +
            "4) Ввести не верный логин\n" +
            "5) Ввести верный пароль\n" +
            "6) Нажать на кнопку Войти\n" +
            "7) Проверить вывод сообщения о неверном вводе логина или пароля.")
    void wrongLoginTest() {
        openPage
                .openPage()
                .chooseCity();

        authorizationPage
                .openFormOfAuthorization()
                .enterLogin(credentials.wrongLogin())
                .enterPassword(credentials.truePassword())
                .enter()
                .checkWrongLoginOrPasswordOfAuthorization();
    }

    @Test
    @Tag("Authorization")
    @AllureId("12077")
    @DisplayName("Invalid authorization with wrong password")
    @Feature("Authorization")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть форму авторизации \n" +
            "4) Ввести верный логин\n" +
            "5) Ввести не верный пароль\n" +
            "6) Нажать на кнопку Войти\n" +
            "7) Проверить вывод сообщения о неверном вводе логина или пароля.")
    void wrongPasswordTest() {
        openPage
                .openPage()
                .chooseCity();

        authorizationPage
                .openFormOfAuthorization()
                .enterLogin(credentials.trueLogin())
                .enterPassword(credentials.wrongPassword())
                .enter()
                .checkWrongLoginOrPasswordOfAuthorization();
    }

    @ParameterizedTest
    @Tag("Authorization")
    @AllureId("12087")
    @DisplayName("Invalid authorization with wrong passwotd and parameterize arguments")
    @MethodSource("argsProviderFactory")
    @Feature("Authorization")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.sela.ru", url = "https://www.sela.ru")
    @Description("1) Зайти на сайт (https://www.sela.ru/)\n" +
            "2) Выбрать город по умолчанию\n" +
            "3) Открыть форму авторизации \n" +
            "4) Ввести верный логин\n" +
            "5) Ввести не верный пароль\n" +
            "6) Нажать на кнопку Войти\n" +
            "7) Проверить вывод сообщения о неверном вводе логина или пароля.")
    void wrongPasswordParameterizedTest(String login, String password) {
        openPage
                .openPage()
                .chooseCity();

        authorizationPage
                .openFormOfAuthorization()
                .enterLogin(login)
                .enterPassword(password)
                .enter()
                .checkWrongLoginOrPasswordOfAuthorization();
    }

    static Stream<Arguments> argsProviderFactory() {
        return Stream.of(
                Arguments.of(
                        "vildanova-kamilya99@yandex.ru", firstPasswordFaker
                ),
                Arguments.of(
                        "vildanova-kamilya99@yandex.ru", secondPasswordFaker
                )
        );
    }
}
