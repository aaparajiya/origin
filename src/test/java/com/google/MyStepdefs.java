package com.google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    HomePage homePage=new HomePage();
    CreatAccount creatAccount= new CreatAccount();

    @Given("^I should navigate google web page$")
    public void iShouldNavigateGoogleWebPage() throws InterruptedException {
        homePage.clickSignInButt();
        homePage.clickCreateAccountLink();
        homePage.clickMySelf();
    }

    @Then("^I should create google account$")
    public void iShouldCreateGoogleAccount() throws InterruptedException {
        creatAccount.enterFirstName();
        creatAccount.enterLastName();
        creatAccount.enterUserName();
        creatAccount.enterPassword();
        creatAccount.enterConfirmPassword();
        creatAccount.clickNextButt();
    }
}
