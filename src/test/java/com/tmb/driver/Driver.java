package com.tmb.driver;

import com.tmb.utils.ConfigLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public final class Driver {

    private Driver(){}

    public static void initDriver(String browser) {
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriver(new ChromeDriver());
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            DriverManager.setDriver(new FirefoxDriver());
        }
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(ConfigLoader.getInstance().getUrl());
    }

    public static void quitDriver() {
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }
}
