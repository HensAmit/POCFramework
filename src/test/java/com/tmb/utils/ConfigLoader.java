package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;

import java.util.Properties;

public class ConfigLoader {
    private static ConfigLoader configLoader;
    private final Properties properties;

    private ConfigLoader(){
        properties = PropertyUtils.propertyLoader(FrameworkConstants.getConfigFilePath());
    }

    public static ConfigLoader getInstance(){
        if(configLoader==null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getUrl(){
        String url = properties.getProperty("url");
        if(url!=null){
            return url;
        } else{
            throw new RuntimeException("url is null in the properties file.");
        }
    }

    public String getRetryYesOrNo(){
        String retryFailedTests = properties.getProperty("retryFailedTests");
        if(retryFailedTests!=null){
            return retryFailedTests;
        } else{
            throw new RuntimeException("retryFailedTests is null in the properties file.");
        }
    }
}
