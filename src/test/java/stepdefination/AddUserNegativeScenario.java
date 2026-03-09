package stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Base;
import Assertions.Assertions;
import java.time.Duration;

public class AddUserNegativeScenario extends Base {


    @When("I enter registration details with invalid first name")
    public void iEnterRegistrationDetailsWithInvalidFirstName() {
        addNewuser.Fullnames("1"); // invalid: too short and contains digit
        addNewuser.Surname("ValidSurname");
        addNewuser.Emailadress("validemail@example.com");
        addNewuser.Password("ValidPass@123");
        addNewuser.ConfirmPassword("ValidPass@123");
        addNewuser.SelectGroup("2nd Group 2026 (2026)");
    }

    @When("I enter registration details with invalid last name")
    public void iEnterRegistrationDetailsWithInvalidLastName() {
        addNewuser.Fullnames("ValidName");
        addNewuser.Surname("1"); // invalid last name
        addNewuser.Emailadress("validemail@example.com");
        addNewuser.Password("ValidPass@123");
        addNewuser.ConfirmPassword("ValidPass@123");
        addNewuser.SelectGroup("2nd Group 2026 (2026)");
    }

    @When("I enter registration details with short password")
    public void iEnterRegistrationDetailsWithShortPassword() {
        addNewuser.Fullnames("ValidName");
        addNewuser.Surname("ValidSurname");
        addNewuser.Emailadress("validemail@example.com");
        addNewuser.Password("123"); // too short
        addNewuser.ConfirmPassword("123");
        addNewuser.SelectGroup("2nd Group 2026 (2026)");
    }

    @When("I enter registration details with password missing special character")
    public void iEnterRegistrationDetailsWithPasswordMissingSpecialCharacter() {
        addNewuser.Fullnames("ValidName");
        addNewuser.Surname("ValidSurname");
        addNewuser.Emailadress("validemail@example.com");
        addNewuser.Password("Password123"); // no special char
        addNewuser.ConfirmPassword("Password123");
        addNewuser.SelectGroup("2nd Group 2026 (2026)");
    }

    @When("I enter registration details with mismatched confirmation")
    public void iEnterRegistrationDetailsWithMismatchedConfirmation() {
        addNewuser.Fullnames("ValidName");
        addNewuser.Surname("ValidSurname");
        addNewuser.Emailadress("validemail@example.com");
        addNewuser.Password("ValidPass@123");
        addNewuser.ConfirmPassword("DifferentPass@123"); // mismatch
        addNewuser.SelectGroup("2nd Group 2026 (2026)");
    }


    @Then("I should see a mandatory fields error")
    public void iShouldSeeMandatoryFieldsError() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        Assertions.assertMandatoryFields(alert.getText());
        alert.accept();
    }

    @Then("I should see a first name error")
    public void iShouldSeeFirstNameError() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        Assertions.assertFirstName(alert.getText());
        alert.accept();
    }

    @Then("I should see a last name error")
    public void iShouldSeeLastNameError() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        Assertions.assertLastName(alert.getText());
        alert.accept();
    }

    @Then("I should see a password length error")
    public void iShouldSeePasswordLengthError() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        Assertions.assertPasswordLength(alert.getText());
        alert.accept();
    }

    @Then("I should see a password special character error")
    public void iShouldSeePasswordSpecialCharError() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        Assertions.assertPasswordSpecialChar(alert.getText());
        alert.accept();
    }

    @Then("I should see a password confirmation error")
    public void iShouldSeePasswordConfirmationError() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        Assertions.assertPasswordConfirmation(alert.getText());
        alert.accept();

    }
}
