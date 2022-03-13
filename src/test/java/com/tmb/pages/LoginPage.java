package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public final class LoginPage {

    private final By fldUserName = By.id("txtUsername");
    private final By fldPassword = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");

    public LoginPage enterUsername(String username){
        DriverManager.getDriver().findElement(fldUserName).sendKeys("Admin");
        return this;
    }

    public LoginPage enterPassword(String password){
        DriverManager.getDriver().findElement(fldPassword).sendKeys("admin123");
        return this;
    }

    public HomePage clickLoginBtn(){
        DriverManager.getDriver().findElement(btnLogin).click();
        return new HomePage();
    }
}
