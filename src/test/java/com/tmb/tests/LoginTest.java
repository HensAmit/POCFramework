package com.tmb.tests;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("nobroker", Keys.ENTER);
    }

    @Test
    public void test5(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
    }
}
