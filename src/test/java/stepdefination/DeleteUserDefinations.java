package stepdefination;

import Pages.DeleteUser;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Base;

import java.time.Duration;

public class DeleteUserDefinations extends Base {

    @Given("I am on the Ndosi login Dashboard")
    public void openLoginScreen() {
        deleteUser.ClickLogin_Btn();  // ✅ use Base’s initialized instance
    }

    @When("I enter the admin email {string}")
    public void enterAdminUsername(String username) {
        deleteUser.enterUsername(username);
    }

    @And("I enter the admin valid password {string}")
    public void enterAdminPassword(String password) {
        deleteUser.enterPassword(password);
    }

    @And("I click the delete login button")
    public void clickLoginButton() {
        deleteUser.clickLoginButton();
    }

    @And("I click the Admin Tab")
    public void clickAdminButton() {
        deleteUser.clickAdminButton();
    }

    @And("I navigate to the Admin Panel section")
    public void navigateToAdminPanel() {
        deleteUser.clickAdminPanel();
    }

    @And("I click the Users Tab")
    public void clickeUsersTab() {
        deleteUser.clickDeleteUsersSection();
    }

    @And("I search for an email to be delete the user")
    public void searchUserByEmailToDelete() {
        deleteUser.searchUserByEmailToDelete(Base.registeredEmail);
    }

    @And("I delete the newly created user by email")
    public void deleteUserByEmail() {
        deleteUser.clickDeleteUserButton();
    }

    @Then("a confirmation message {string} is displayed after deletion")
    public void verifyDeleteConfirmationMessage(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert confirmAlert = wait.until(ExpectedConditions.alertIsPresent());
        String actualConfirmMessage = confirmAlert.getText();
        Assert.assertEquals(actualConfirmMessage, expectedMessage,
                "Confirmation message did not match!");
        confirmAlert.accept();


        Alert successAlert = wait.until(ExpectedConditions.alertIsPresent());
        String actualSuccessMessage = successAlert.getText();
        Assert.assertEquals(actualSuccessMessage, "User deleted successfully!",
                "Success message did not match!");
        successAlert.accept(); // ✅ close the success popup
    }







    @And("I navigate back to the website home dashaboard")
    public void navigateBackToomePage() {
        deleteUser.clickBackToWebsiteButton();
    }
    @And("I navigate to the admin Button to logout")
    public void clickAdminAgain() {
        deleteUser.clickAdminButton();
    }

    @And("I click the Logout Btn")
    public void clickLogoutButton() {
        deleteUser.clickLogoutButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert logoutAlert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = logoutAlert.getText();
        Assert.assertEquals(actualMessage, "Are you sure you want to logout?",
                "Logout confirmation message did not match!");
        logoutAlert.accept();
    }

}


