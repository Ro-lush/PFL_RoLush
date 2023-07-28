package com.pflb.UI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {


        try {
            fileInputStream = new FileInputStream("/Users/romanlusnikov/IdeaProjects/PFL_RoLush/QA/src/test/resources/conf.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key); }
}

