package com.pflb.UI;



import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;

@ExtendWith(TestSkreenshot.class)
public class LoginTest {
    public static LoginPage loginPage;
    public static SortBy sortBy;
    public static WebDriver driver;
    public  static WebDriverWait wait;
   public static EnvConfig envConfig;
    public static int[] beforeSort = new int[10];
    public static int[] afterSort = new int[10];

    @BeforeEach
    public void initialization(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
   // driver.get(ConfProperties.getProperty("url"));
       envConfig = new EnvConfig();
       driver.get(envConfig.baseUrl);
        loginPage = new LoginPage(driver);
        sortBy = new SortBy(driver);


    }
//@AfterEach
    public  void driverQuit() {
        driver.close();
        driver.quit();
    }

   @Test
    @Description("Test login")

    public void loginTest() {

//      loginPage.inputLogin(ConfProperties.getProperty("login"));
//      loginPage.inputPass(ConfProperties.getProperty("password"));

       loginPage.inputLogin(envConfig.username);
       loginPage.inputPass(envConfig.userPassword);
      loginPage.inputBtn();

       wait.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert().accept();

       driverQuit();

    }
    @Test
    @Description("Test sortById")

    public void SortTest(){
        sortBy.userBtn();
         sortBy.readBtn();
        for (int i = 0; i < beforeSort.length; i++) {
            beforeSort[i]= Integer.parseInt(sortBy.getUserId(i));
        }

        sortBy.sortById();
        for (int i = 0; i < afterSort.length; i++) {
            afterSort[i]= Integer.parseInt(sortBy.getUserId(i));
        }

        if (Arrays.equals(beforeSort,afterSort)){
            Assert.fail("ОШИБКА!!! ТЕСТ ПРОВАЛЕН!!");

        } else {
            System.out.println("ТЕСТ ПРОЙДЕН!!!");
        }
        System.out.println("BeforeSort = "+ Arrays.toString(beforeSort) +" AfterSort = "+ Arrays.toString(afterSort));
        driverQuit();
    }
}