package com.spurqlabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator_Pages {

    WebDriver driver;
    @FindBy(id = "sciOutPut")
    WebElement result;
    @FindBy(xpath = "//span[text()='1']")
    WebElement number1;
    @FindBy(xpath = "//span[text()='2']")
    WebElement number2;
    @FindBy(xpath = "//span[text()='3']")
    WebElement number3;
    @FindBy(xpath = "//span[text()='+']")
    WebElement operator;

    public Calculator_Pages(WebDriver driver1)
    {
        this.driver = driver1;
        PageFactory.initElements(driver1, this);
    }
    public void calculate()
    {
        number1.click();
        operator.click();
        number2.click();
    }
    public String getResults() {
        return result.getText().trim();
    }
}
