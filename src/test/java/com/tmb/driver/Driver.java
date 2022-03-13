package com.tmb.driver;

import com.tmb.utils.ConfigLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public final class Driver {

    private Driver(){}

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
        DriverManager.setDriver(new ChromeDriver());
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(ConfigLoader.getInstance().getUrl());
    }

    public static void quitDriver() {
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }
}
