package com.vildanova.tests;

import com.github.javafaker.Faker;

public class TestData {

    public static Faker faker = new Faker();

    public static String
            dress = "Платье",
            passwordFaker = faker.internet().password();
}
