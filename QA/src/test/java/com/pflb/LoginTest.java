package com.pflb;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
public static LoginPage loginPage;


    public void setup(){
        ChromeDriver driver = new ChromeDriver();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }
   @Test
    public void loginTest(){
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPass(ConfProperties.getProperty("password"));
        loginPage.inputBtn();
    }
}
