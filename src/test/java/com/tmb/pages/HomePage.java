package com.tmb.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private final By linkWelcome = By.id("welcome");
    private final By linkLogOut = By.xpath("//a[text()='Logout']");

    public HomePage clickLinkWelcome(){
        click(linkWelcome);
        return this;
    }

    public LoginPage clickLogout(){
        click(linkLogOut);
        return new LoginPage();
    }
}
