package com.tmb.helper;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Helper {

    private Helper(){}

    public static String getCurrentTimeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
    }

    public static String getScreenShot(){
        return ((TakesScreenshot)(DriverManager.getDriver())).getScreenshotAs(OutputType.BASE64);
    }
}
