package com.tmb.pages;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getWaitTimeInSeconds()));

    public String getTitle(){
        return DriverManager.getDriver().getTitle();
    }

    protected void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by, String text){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        DriverManager.getDriver().findElement(by).sendKeys(text);
    }
}
