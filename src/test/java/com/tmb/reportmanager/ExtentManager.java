package com.tmb.reportmanager;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private ExtentManager(){}

    private static final ThreadLocal<ExtentTest> extentTestTL = new ThreadLocal<>();

    static ExtentTest getExtentTest(){
        return extentTestTL.get();
    }

    static void setExtentTest(ExtentTest exTest){
        extentTestTL.set(exTest);
    }
}
