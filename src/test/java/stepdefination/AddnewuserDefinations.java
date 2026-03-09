package stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Base;
import utils.TestDataGenerator;


import java.time.Duration;

public class AddnewuserDefinations extends Base {


    @Given("I am on the Ndosi login screen")
    public void iAmOnLoginScreen() {

    }

    @And("I click \"Sign up here\"")
    public void iClickSignUpHere() {
        addNewuser.SignUphere();
    }

    @When("I enter registration details")
    public void iEnterRegistrationDetails() {
        String firstName = TestDataGenerator.generateFirstName();
        String lastName = TestDataGenerator.generateLastName();
        Base.registeredEmail = TestDataGenerator.generateEmail();
        Base.registeredPassword = TestDataGenerator.generatePassword();
        String group = "2nd Group 2026 (2026)";

        addNewuser.Fullnames(firstName);
        addNewuser.Surname(lastName);
        addNewuser.Emailadress(Base.registeredEmail);
        addNewuser.Password(Base.registeredPassword);
        addNewuser.ConfirmPassword(Base.registeredPassword);
        addNewuser.SelectGroup(group);
        // Debug log so you can see generated values in console
        System.out.println("Registered user: " + firstName + " " + lastName);
        System.out.println("Email: " + registeredEmail);
        System.out.println("Password: " + registeredPassword);
    }

    @And("I press the \"Create account\" button")
    public void iPressCreateAccountButton() {
        addNewuser.CreateAccount();
    }

    @Then("I should see a registration success message")
    public void iShouldSeeSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = alert.getText();
        String expectedMessage = "Registration submitted successfully. Your account is pending admin approval.";
        Assert.assertEquals(actualMessage, expectedMessage);
        alert.accept();
    }

    @And("I confirm by clicking \"OK\"")
    public void iConfirmByClickingOk() {
        // Already handled by alert.accept() above
    }
}
