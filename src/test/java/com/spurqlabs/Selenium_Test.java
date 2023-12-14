package com.spurqlabs;

import com.spurqlabs.pages.BasicCalculatorPage;
import com.spurqlabs.pages.Calculator_Pages;
import com.spurqlabs.utils.Web_Util;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_Test {
        WebDriver driver;

        @BeforeTest
        public  void beforeTest()
        {
            driver = Web_Util.initDriver();
        }

        @AfterTest
        public void afterTest() throws InterruptedException {
            Thread.sleep(2000);
            Web_Util.closeDriver();
        }
    @Test
    public void SeleniumTest() throws InterruptedException {
        BasicCalculatorPage basicCalculatorPage = new BasicCalculatorPage(driver);
        basicCalculatorPage.calculate("2","+","3");
        Assert.assertEquals(basicCalculatorPage.getResults(),"5");
    }

    @Test
    public void PageObJectTest() throws InterruptedException {
        Calculator_Pages calculatorPage = new Calculator_Pages(driver);
        calculatorPage.calculate();
        Assert.assertEquals(calculatorPage.getResults(),"3");
    }


}
