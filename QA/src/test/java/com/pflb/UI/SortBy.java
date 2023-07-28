package com.pflb.UI;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SortBy {
    public WebDriver driver;
    private int ID=0;



    public SortBy(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css = "a[id=basic-nav-dropdown]")
    private WebElement userBtn;

    @FindBy(css = "a[href=\"#/read/users\"]")
    private WebElement readBtn;


    @FindBy(css = "#root > div > section > div > div > button:nth-child(3)")
    private WebElement sortById;

    @FindBy(css = "table tbody tr")
    private List<WebElement> id;


    @Step
    public void userBtn(){
        userBtn.click();
    }
    @Step
    public void readBtn(){
        readBtn.click();
    }
    @Step
    public void sortById(){
       sortById.click();
    }
    @Step
    private List<WebElement> getUserRowCells(int num) {
        WebElement tableRow = id.get(num);
        return tableRow.findElements(By.cssSelector("td"));
    }
    @Step
    public String getUserId(int num) {
        List<WebElement> tds = getUserRowCells(num);
        return tds.get(ID).getText();
    }

}
