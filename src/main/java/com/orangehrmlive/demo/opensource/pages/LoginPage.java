package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText=By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    By userName=By.name("username");
    By password=By.name("password");
    By loginButton=By.xpath("//button[@type='submit']");
    By getTextAfterLogin=By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");


    public void enterUserName(String userNameText){
        sendTextToElement(userName,userNameText);
    }

    public void enterPassword(String passwordText){
        sendTextToElement(password,passwordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeMessage(){
      return   getTextFromElement(getTextAfterLogin);
    }
}
