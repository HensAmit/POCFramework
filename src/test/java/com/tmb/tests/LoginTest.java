package com.tmb.tests;

import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        HomePage homePage = loginPage.enterUsername("Admin").enterPassword("admin123").clickLoginBtn();
        homePage.clickLinkWelcome().clickLogout();
    }
}
