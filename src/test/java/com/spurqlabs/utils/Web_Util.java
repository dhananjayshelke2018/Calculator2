package com.spurqlabs.utils;

import com.spurqlabs.core.TestContexts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Util extends TestContexts {
    public static WebDriver initDriver()
    {
        driver = new ChromeDriver();
        return driver;
    }

    public static void closeDriver()
    {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
