package com.orangehrmlive.demo.opensource.testbase;

import com.orangehrmlive.demo.opensource.propertyreader.PropertyReader;
import com.orangehrmlive.demo.opensource.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void teraDown(){
        closeBrowser();
    }

}
