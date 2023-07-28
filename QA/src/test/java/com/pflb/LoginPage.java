package com.pflb;

import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(css = "input[type=email]")
    private WebElement loginField;

    @FindBy(css = "button[type=submit]")
    private WebElement loginBtn;

    @FindBy(css = "input[type=text]")
    private WebElement password;

    @Step
    public void inputLogin(String login){
        loginField.sendKeys(login);
    }
    @Step
    public void inputPass(String pass){
        password.sendKeys(pass);
    }

    @Step
    public void inputBtn(){
        loginBtn.click();
    }



}
