package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogOut = By.xpath("//a[text()='Logout']");

    public HomePage clickLinkWelcome(){
        DriverManager.getDriver().findElement(linkWelcome).click();
        return this;
    }

    public LoginPage clickLogout(){
        DriverManager.getDriver().findElement(linkLogOut).click();
        return new LoginPage();
    }
}
