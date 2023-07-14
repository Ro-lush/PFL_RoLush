package com.pflb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
   private static FileInputStream fileInputStream;
    private static Properties properties;

    {
        try {
            fileInputStream = new FileInputStream("QA/src/test/resources/conf.properties");
             properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static String getProperty(String text){
        return properties.getProperty(text);
    }
}
