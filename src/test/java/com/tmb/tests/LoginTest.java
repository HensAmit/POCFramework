package com.tmb.tests;

import com.tmb.dataproviders.DataProviders;
import com.tmb.pages.LoginPage;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginTest extends BaseTest{

    @Test (dataProvider = "loginTest1Data")
    public void loginTest1(Map<String, String> data){
        String title = new LoginPage()
                .enterUsername(data.get("username"))
                .enterPassword(data.get("password"))
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        assertThat(title).isEqualTo("OrangeHRM");
        System.out.println(data.get("field1"));
        System.out.println(data.get("field2"));
    }

    @Test (dataProvider = "loginTest2Data")
    public void loginTest2(Map<String, String> data){
        String title = new LoginPage()
                .enterUsername(data.get("username"))
                .enterPassword(data.get("password"))
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        assertThat(title).isEqualTo("OrangeHRM");
        System.out.println(data.get("field1"));
    }
}
