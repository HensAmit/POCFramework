package com.tmb.tests;

import com.tmb.pages.LoginPage;
import static org.assertj.core.api.Assertions.*;

import com.tmb.utils.Category;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginTest extends BaseTest{

    @Test (dataProvider = "loginTest1Data", groups={Category.PRIORITY_1, Category.REGRESSION})
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

    @Test (dataProvider = "loginTest2Data", groups={Category.REGRESSION})
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
