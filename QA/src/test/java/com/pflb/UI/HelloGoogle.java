package com.pflb.UI;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.performance.Performance;
import org.openqa.selenium.devtools.v115.performance.model.Metric;


import java.util.List;
import java.util.Optional;

public class HelloGoogle {
    public String timestamp;
    @Test
    @Description("HelloGoole")
    @Step()
    public void openGoole() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Performance.enable(Optional.empty()));
        List<Metric> metricList = devTools.send(Performance.getMetrics());

        driver.get("https://google.com");
        driver.quit();

        for (Metric m : metricList) {
            if (m.getName().equals("Timestamp")){
             timestamp=m.getName() + " = " + m.getValue();
            }
        }
       metricTimeSpeedPage(timestamp);
    }
    @Step
    public void metricTimeSpeedPage(String name){
        Assert.assertNotEquals(name,null);
    }
}
