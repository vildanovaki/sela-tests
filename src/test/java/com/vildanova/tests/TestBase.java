package com.vildanova.tests;

import com.codeborne.selenide.Configuration;
import com.vildanova.config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public static CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
}
