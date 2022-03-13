package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage{

    private final By fldUserName = By.id("txtUsername");
    private final By fldPassword = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");

    public LoginPage enterUsername(String username){
        sendKeys(fldUserName, username);
        return this;
    }

    public LoginPage enterPassword(String password){
        sendKeys(fldPassword, password);
        return this;
    }

    public HomePage clickLoginBtn(){
        click(btnLogin);
        return new HomePage();
    }
}
