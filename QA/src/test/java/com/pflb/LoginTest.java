package com.pflb;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginTest {

   @Test
    public void loginTest() throws InterruptedException {
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      driver.get(ConfProperties.getProperty("url"));

      LoginPage loginPage = new LoginPage(driver);
      loginPage.inputLogin(ConfProperties.getProperty("login"));
      loginPage.inputPass(ConfProperties.getProperty("password"));
      loginPage.inputBtn();
      Thread.sleep(1000);

      Alert alert = driver.switchTo().alert();
       alert.accept();

         SortBy sortBy = new SortBy(driver);
       sortBy.userBtn();
       sortBy.readBtn();
       Thread.sleep(1000);
       sortBy.sortByFirstName();
       driver.close();

    }
}
