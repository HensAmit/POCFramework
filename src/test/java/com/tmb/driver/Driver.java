package com.tmb.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    private static WebDriver driver;

    public static void initDriver(){
        if(Objects.isNull(driver)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get("https://www.google.co.in");
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(driver)){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
