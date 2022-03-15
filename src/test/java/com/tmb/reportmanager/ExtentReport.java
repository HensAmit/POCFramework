package com.tmb.reportmanager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tmb.constants.FrameworkConstants;

public final class ExtentReport {

    private ExtentReport(){}

    private static ExtentReports extent;

    public static void initReports(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getReportPath());
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("TMB Report");
        spark.config().setReportName("Demo Report");
    }

    public static void createTest(String testName){
        ExtentManager.setExtentTest(extent.createTest(testName));
    }

    public static void flushReports(){
        extent.flush();
    }

    public static void addCategories(String[] categories){
        for(String category : categories){
            ExtentManager.getExtentTest().assignCategory(category);
        }
    }
}
