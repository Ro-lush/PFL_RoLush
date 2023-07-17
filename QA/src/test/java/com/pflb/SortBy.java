package com.pflb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortBy {
    public WebDriver driver;

    public SortBy(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/div/div[1]")
    private WebElement userBtn;

    @FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/div/div[1]/div/a[1]")
    private WebElement readBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/div/button[4]")
    private WebElement sortByFirstName;


    public void userBtn(){
        userBtn.click();
    }

    public void readBtn(){
        readBtn.click();
    }

    public void sortByFirstName(){
        sortByFirstName.click();
    }
}
