package com.tmb.tests;

import com.tmb.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void test2(){
        Driver.driver.findElement(By.name("q")).sendKeys("youtube", Keys.ENTER);
    }
}
