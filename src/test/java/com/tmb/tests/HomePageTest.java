package com.tmb.tests;

import com.tmb.pages.LoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;

public class HomePageTest extends BaseTest{

    @Test (dataProvider = "homePageTest1Data")
    public void homePageTest1(Map<String, String> data){
        String title = new LoginPage()
                .enterUsername(data.get("username"))
                .enterPassword(data.get("password"))
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");
        System.out.println(data.get("field1"));
        System.out.println(data.get("field2"));
    }

    @Test (dataProvider = "homePageTest2Data")
    public void homePageTest2(Map<String, String> data){
        String title = new LoginPage()
                .enterUsername(data.get("username"))
                .enterPassword(data.get("password"))
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");
        System.out.println(data.get("field1"));
    }
}
