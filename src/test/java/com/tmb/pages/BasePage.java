package com.tmb.pages;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;
import com.tmb.reportmanager.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getWaitTimeInSeconds()));

    public String getTitle(){
        ExtentLogger.info("Fetching the page title");
        return DriverManager.getDriver().getTitle();
    }

    protected void click(By by, String elementName){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        DriverManager.getDriver().findElement(by).click();
        ExtentLogger.pass(elementName+" is clicked");
    }

    protected void sendKeys(By by, String text, String elementName){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        DriverManager.getDriver().findElement(by).sendKeys(text);
        ExtentLogger.pass(text+" is entered in "+elementName);
    }
}
