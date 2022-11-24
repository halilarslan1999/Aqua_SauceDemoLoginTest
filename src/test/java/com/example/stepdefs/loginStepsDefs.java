package com.example.stepdefs;

import com.example.pages.MainPage;
import com.example.utilities.ConfigurationReader;
import com.example.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;

public class loginStepsDefs {
    MainPage mainPage=new MainPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        mainPage.login(username,password);


    }
    @Then("The user should be able to login successfully")
    public void the_user_should_be_able_to_login_successfully() {



    }
}
