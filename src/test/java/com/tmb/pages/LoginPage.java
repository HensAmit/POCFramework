package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage{

    private final By fldUserName = By.id("txtUsername");
    private final By fldPassword = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");

    public LoginPage enterUsername(String username){
        sendKeys(fldUserName, username, "username field");
        return this;
    }

    public LoginPage enterPassword(String password){
        sendKeys(fldPassword, password, "password field");
        return this;
    }

    public HomePage clickLoginBtn(){
        click(btnLogin, "Login button");
        return new HomePage();
    }
}
