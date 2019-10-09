package com.google;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector extends BasePage {

    public static void selectBrowser(){
        LoadProp loadProp=new LoadProp();
        String browser = loadProp.getProperty("browser");

        if(browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.driver.chrome", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        }else {
        System.out.println("Invalid Browser");
        }
    }
}
