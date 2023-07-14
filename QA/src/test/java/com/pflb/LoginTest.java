package com.pflb;


import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginTest {

   @Test
    public void loginTest(){
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      driver.get(ConfProperties.getProperty("url"));

        LoginPage loginPage = new LoginPage(driver);
      loginPage.inputLogin(ConfProperties.getProperty("login"));
      loginPage.inputPass(ConfProperties.getProperty("password"));
      loginPage.inputBtn();

    }
}
