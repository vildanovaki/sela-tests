package com.vildanova.tests;

import com.vildanova.pages.AuthorizationPage;
import org.junit.jupiter.api.Test;

public class AuthorizationTests extends TestBase{

    @Test
    void validAuthorization(){

        AuthorizationPage authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();

        authorizationPage
                .openFormOfAuthorization()
                .enterLogin()
                .enterPassword()
                .enter()
                .checkValidAuthorization();
    }
}
