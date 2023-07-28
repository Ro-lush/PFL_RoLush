package com.pflb.UI;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.pflb.UI.LoginTest.driver;

public class TestSkreenshot implements TestWatcher {
    @Override
   public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment("screen",
                "image/png", "png",
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        driver.close();
        driver.quit();
    }

}
