package com.pflb.UI;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvConfig {
    public final String env;
    public final String baseUrl;
    public final String username;
    public final String userPassword;
    public final String apiUrl;

    private static final String ENV_NAME = "ACTIVE_ENVIRONMENT";

    public EnvConfig() {
        String getenv = System.getenv(ENV_NAME);
        if (getenv == null) env = "conf";
        else env = getenv;
        Properties properties = parseProperties();
        this.baseUrl = properties.getProperty("url");
        this.username =  properties.getProperty("login");
        this.userPassword = properties.getProperty("password");
        this.apiUrl = properties.getProperty("urlAPI");

    }
    public Properties parseProperties() {

        try (
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream(env + ".properties")
        ) {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
