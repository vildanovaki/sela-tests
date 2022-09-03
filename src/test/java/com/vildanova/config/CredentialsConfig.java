package com.vildanova.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {
    String trueLogin();
    String truePassword();
    String wrongLogin();
    String wrongPassword();
}
