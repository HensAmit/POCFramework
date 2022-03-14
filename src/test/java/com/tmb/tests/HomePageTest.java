package com.tmb.tests;

import com.tmb.dataproviders.DataProviders;
import com.tmb.pages.LoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;

public class HomePageTest extends BaseTest{

    @Test (dataProvider = "homePageTest1Data", dataProviderClass = DataProviders.class)
    public void homePageTest1(Map<String, String> data){
        String title = new LoginPage()
                .enterUsername("Admin")
                .enterPassword("admin123")
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");
        System.out.println(data.get("field1"));
        System.out.println(data.get("field2"));
    }

    @Test (dataProvider = "homePageTest2Data", dataProviderClass = DataProviders.class)
    public void homePageTest2(Map<String, String> data){
        String title = new LoginPage()
                .enterUsername("Admin")
                .enterPassword("admin123")
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");
        System.out.println(data.get("field1"));
    }
}
