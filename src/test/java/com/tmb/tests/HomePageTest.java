package com.tmb.tests;

import com.tmb.pages.LoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void loginTest(){
        String title = new LoginPage()
                .enterUsername("Admin")
                .enterPassword("admin123")
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");
    }
    @Test
    public void loginTest1(){
        String title = new LoginPage()
                .enterUsername("Admin")
                .enterPassword("admin123")
                .clickLoginBtn()
                .clickLinkWelcome()
                .clickLogout()
                .getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");
    }
}
