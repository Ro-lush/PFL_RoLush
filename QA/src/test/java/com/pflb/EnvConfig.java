package com.pflb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvConfig {
    public final String env;
    public final String baseUrl;
    public final String username;
    public final String userPassword;

    private static final String ENV_NAME = "ACTIVE_ENVIRONMENT";

    public EnvConfig() {
        String getenv = System.getenv(ENV_NAME);
        if (getenv == null) env = "default";
        else env = getenv;
        Properties properties = parseProperties();
        this.baseUrl = properties.getProperty("url");
        this.username =  properties.getProperty("login");
        this.userPassword = properties.getProperty("password");

    }
    public Properties parseProperties() {

        try (InputStream inputStream = getClass().getClassLoader().getResource(env + ".properties")
                .openStream()
        ) {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
