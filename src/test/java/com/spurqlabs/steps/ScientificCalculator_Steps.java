package com.spurqlabs.steps;

import com.spurqlabs.core.TestContexts;
import io.cucumber.java.en.Given;

public class ScientificCalculator_Steps extends TestContexts {

    @Given("I am on scientific calculator page")
    public void iAmOnScientificCalculatorPage() {
        driver.get("https://www.calculator.net/scientific-calculator.html");
    }
}
