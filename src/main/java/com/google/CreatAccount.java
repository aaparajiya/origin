package com.google;

import org.openqa.selenium.By;

public class CreatAccount  extends Utils{
    LoadProp loadProp=new LoadProp();
    String uName="ABC"+Utils.randomDate();
    private By fName = By.xpath("//input[@id='firstName']");
    private By lName = By.xpath("//input[@id='lastName']");
    private By userName = By.xpath("//input[@id='username']");
    private By password = By.xpath("//input[@name='Passwd']");
    private By confirmPassword = By.xpath("//input[@name='ConfirmPasswd']");
    private By nextButt = By.xpath("//span[@class='RveJvd snByac']");

    public void enterFirstName() throws InterruptedException {
        Thread.sleep(2000);
        clickMethod(fName);
        typeText(fName,loadProp.getProperty("firstName"));
    }
    public void enterLastName() throws InterruptedException {
        Thread.sleep(1000);
        typeText(lName,loadProp.getProperty("lastName"));
    }
    public void enterUserName(){
        typeText(userName,uName);
    }
    public void enterPassword(){
        typeText(password,loadProp.getProperty("password"));
    }
    public void enterConfirmPassword(){
        typeText(confirmPassword,loadProp.getProperty("confirmPassword"));
    }
    public void clickNextButt(){
        clickMethod(nextButt);
    }
}
