package com.spurqlabs.core;

import com.spurqlabs.utils.Web_Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends TestContexts {

    @Before
    public void beforeScenario()
    {
        driver= Web_Util.initDriver();
    }

    @After
    public void afterScenario()
    {
        Web_Util.closeDriver();

    }

}
