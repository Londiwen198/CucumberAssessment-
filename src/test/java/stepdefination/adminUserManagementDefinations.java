package stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Base;


import java.time.Duration;

public class adminUserManagementDefinations extends Base {


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        adminUserManagement.clickNavLoginButton();
    }

    @When("I enter admin username {string}")
    public void iEnterAdminUsername(String username) {
        adminUserManagement.enterUsername(username);
    }

    @And("I enter admin password {string}")
    public void iEnterAdminPassword(String password) {
        adminUserManagement.enterPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        adminUserManagement.clickLoginButton();



    }

    @And("I click the Admin button")
    public void iClickAdminButton() {
        adminUserManagement.clickadminButton();


    }

    @And("I navigate to the admin panel")
    public void iNavigateToAdminPanel() {
        adminUserManagement.ClickAdminpanel();
    }

    @And("I go to the approval section")
    public void iGoToApprovalSection() {
        adminUserManagement.Aproveuser();
    }

    @When("I search for the registered user by email")
    public void iSearchForRegisteredUserByEmail() {
        adminUserManagement.searchNewUser(registeredEmail); // reuse from registration
    }

    @And("I click Approve for that user")
    public void iClickApproveForUser() {
        adminUserManagement.clickapprove();

    }

    @And("I navigate to the users section")
    public void iClickUserTab() {
        adminUserManagement.usermanagement();

    }

    @And("I search for the approved user by email")

    public void iSearchForApprovededUserByEmail() {

        adminUserManagement.searchUsertopromote(registeredEmail);

    }

    @And("I change this user's role to \"admin\"")
    public void iSelectAdminFromUserRoleDropdown() {
        adminUserManagement.selectAdminRole();

    }

    @Then("a confirmation message \"User role updated to admin successfully!\" is displayed")
    public void iShouldSeeVerifivationpopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = alert.getText();
        String expectedMessage = "Are you sure you want to change this user's role to \"admin\"?";
        Assert.assertEquals(actualMessage, expectedMessage);
        alert.accept();

    }

    @And("I click OK on the confirmation")
    public void iClickOKOnConfirmationPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = alert.getText();
        String expectedMessage = "User role updated to \"admin\" successfully!";
        Assert.assertEquals(actualMessage, expectedMessage);
        alert.accept();
    }

    @And("I navigate back to the website home page")
    public void NavBacktowesite() {
        adminUserManagement.NavBacktowesite();
    }

    @And("I click admin tab")
    public void ClickAminTab() {
        adminUserManagement.clickadminButton();
    }

    @Then("I click the Logout button")
    public void Logout() {
        adminUserManagement.Logout();
    }

    @And("accept logout confirmation popup")
    public void AcceptLogouComfirmation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = alert.getText();
        String expectedMessage = "Are you sure you want to logout?";
        Assert.assertEquals(actualMessage, expectedMessage);
        alert.accept();
    }
}