package com.google;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By signIn = By.id("gb_70");
    private By createAccount= By.xpath("//span[@class='NlWrkb snByac']");
    private By mySelf = By.xpath("//div[@jsname=\"RZzeR\"]");

    //Method
    public void clickSignInButt() {
        clickMethod(signIn);
    }
    public void clickCreateAccountLink(){
        clickMethod(createAccount);
    }
    public void clickMySelf() throws InterruptedException {
        Thread.sleep(2000);
        clickMethod(mySelf);
    }
}
