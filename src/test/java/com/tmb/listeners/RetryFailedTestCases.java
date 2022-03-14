package com.tmb.listeners;

import com.tmb.utils.ConfigLoader;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

    private int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(ConfigLoader.getInstance().getRetryYesOrNo().equalsIgnoreCase("Yes")){
            int maxRetry = 1;
            if(count< maxRetry){
                count++;
                return true;
            }
            return false;
        }
        return false;
    }
}
