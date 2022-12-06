package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.opensource.testbase.BaseTest;
import com.orangehrmlive.demo.opensource.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.rmi.CORBA.Util;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage obj=new ForgotPasswordPage();
@Test
    public void verifyUserCanClickOnForgotPasswordLink(){
        obj.clickOnForgotPasswordLink();
        Assert.assertEquals(obj.getActualMessage(),"Reset Password");
    }



}
