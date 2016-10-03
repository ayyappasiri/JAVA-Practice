package com.swtestacademy.webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by i81113 on 9/12/2016.
 */
public class FirstAutomationTest {
    @Test
    public void firefoxTest(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://vitpayroll/Employee/Timesheet/TimesheetEntry.aspx");
        //check title
        Assert.assertEquals("Title check failed!", "Teknosa Alışveriş Sitesi - Herkes İçin");

        driver.close();
        driver.quit();
    }
}
