package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("deviceName", "Pixel 3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        //set URL for appium server
        URL url= new URL("http://localhost:4723/wd/hub");


        //launch appiumDriver
        AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url,capabilities);

        //System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getDeviceTime() = " + driver.getDeviceTime());

        Assertions.assertEquals("android",driver.getPlatformName());

        //locate AC element on calculator using AccessibilityId("clear")
        MobileElement clearElem = driver.findElement(MobileBy.AccessibilityId("clear"));
        System.out.println("Text of element: "+ clearElem.getText());
        Assertions.assertTrue(clearElem.isDisplayed());

        Assertions.assertTrue(clearElem.isDisplayed());




        //close the apps
        driver.closeApp();

    }
}
