package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    public static void clickMethod(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static void getText(By by){
        driver.findElement(by).getText();
    }
    public static String randomDate()
    {
        DateFormat format = new SimpleDateFormat("ddmmyyHHmmss");
        return format.format(new Date());
    }

    public  static void takeScreenShot(WebDriver driver, String fileName){
        fileName =fileName+".png";
        String directory = "src\\test\\Resources\\ScreenShot";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
//            FileUtils.copyFile(sourceFile, new File(directory+fileName));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
