package com.pnt.restapi.menuoptiontest;

import com.amazon.MenuOptionSelection.MenuOption;
import common.TestBase;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

import java.util.logging.Logger;

public class MenuOptionsTest extends TestBase {
    private static final Logger logger = Logger.getLogger(MenuOption.class);
    MenuOptionsTest menuOption;


    @Test(priority = 1,description = "verifying amazon option Test")
    public void validateMenuOptionTest(){
        menuOption = PageFactory.initElements(driver,MenuOption.class);
        menuOption.validateMobileApp();
        ExtentTestManager.log("All option selected Successfully",logger);

    }
    @Test(priority = 2,description = "check audioBook link display",enabled = false)
    public void validateAllOptionsDisplayTest(){
         menuOption = PageFactory.initElements(driver,MenuOption.class);
        Assert.assertTrue(  menuOption.optionsDisplay());
        ExtentTestManager.log("AudioBook display",logger);
    }






}
