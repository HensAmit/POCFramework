package com.tmb.reportmanager;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.helper.Helper;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message, boolean takeScreenshot){
        if(takeScreenshot){
            ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(Helper.getScreenShot()).build());
        } else{
            fail(message);
        }
    }

    public static void fail(String message){
        ExtentManager.getExtentTest().fail(message);
    }

    public static void skip(String message){
        ExtentManager.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(Helper.getScreenShot()).build());
    }

    public static void info(String message){
        ExtentManager.getExtentTest().info(message);
    }
}
