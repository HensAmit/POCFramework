package com.tmb.tests;

import com.tmb.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Map;

public class BaseTest {

    @BeforeMethod (alwaysRun = true)
    public void setUp(Object[] data){
        Map<String,String> map = (Map<String,String>)data[0];
        Driver.initDriver(map.get("browser"));
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown(){
        Driver.quitDriver();
    }
}
