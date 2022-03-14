package com.tmb.listeners;

import com.tmb.reportmanager.ExtentLogger;
import com.tmb.reportmanager.ExtentReport;
import org.testng.*;

import java.util.Arrays;

public class Listener implements ITestListener, ISuiteListener {

    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    public void onFinish(ISuite suite) {
        ExtentReport.flushReports();
    }

    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getMethodName());
        ExtentLogger.info("DESCRIPTION : "+result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName()+" is Passed");
    }

    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName()+" is Failed", true);
        ExtentLogger.fail(result.getThrowable().toString());
    }

    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName()+" is Skipped");
    }
}
