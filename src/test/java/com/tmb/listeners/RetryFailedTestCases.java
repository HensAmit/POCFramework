package com.tmb.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

    private int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        int maxRetry = 1;
        if(count< maxRetry){
            count++;
            return true;
        }
        return false;
    }
}
