package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.LoginPage;
import com.orangehrmlive.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    @Test
    public void verifyUserCanLoginSuccessfullyWithValidCredential(){

        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String actualMessage="Dashboard";
        Assert.assertEquals(loginPage.getWelcomeMessage(),actualMessage);

    }

}
