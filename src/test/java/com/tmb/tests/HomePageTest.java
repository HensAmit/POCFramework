package com.tmb.tests;

import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void test2(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("youtube", Keys.ENTER);
    }

    @Test
    public void test3(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("toi", Keys.ENTER);
    }
}
