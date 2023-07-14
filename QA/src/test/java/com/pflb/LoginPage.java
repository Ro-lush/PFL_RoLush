package com.pflb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public ChromeDriver driver;
    public LoginPage(ChromeDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div/div/div/input[1]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/div/div/div/div/button[1]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/div/div/div/div/input[2]")
    private WebElement password;

    public void inputLogin(String login){
        loginField.sendKeys(login);
    }

    public void inputPass(String pass){
        password.sendKeys(pass);
    }

    public void inputBtn(){
        loginBtn.click();
    }
}
