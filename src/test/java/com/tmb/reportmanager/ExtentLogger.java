package com.tmb.reportmanager;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message){
        ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShot()).build());
    }

    public static void skip(String message){
        ExtentManager.getExtentTest().skip(message);
    }

    public static void info(String message){
        ExtentManager.getExtentTest().info(message);
    }

    private static String getScreenShot(){
        return ((TakesScreenshot)(DriverManager.getDriver())).getScreenshotAs(OutputType.BASE64);
    }
}
