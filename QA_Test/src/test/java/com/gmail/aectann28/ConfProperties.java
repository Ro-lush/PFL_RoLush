package com.gmail.aectann28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
 protected static    FileInputStream fileInputStream;
 protected static  Properties properties;
 static {
    {
        try {
            fileInputStream = new FileInputStream("src/test/resource/conf.properties");
             properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
              throw new RuntimeException(e);
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
     }}
public static String getProperty (String key){
    return properties.getProperty(key);
}

}
