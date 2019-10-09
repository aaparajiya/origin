package com.google;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.lexer.Th;

public class Hooks extends BasePage {
    BrowserSelector browserSelector= new BrowserSelector();
    LoadProp loadProp = new LoadProp();
    @Before
    public void openBrowser(){
        BrowserSelector.selectBrowser();
        driver.get(loadProp.getProperty("url"));
    }

    @After
    public void closeBrowser(){
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }

}
