package stepdefination;

import Pages.adminUserManagement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.Base;

public class UserLogin extends Base {

    adminUserManagement adminPage;

    public UserLogin() {
        this.adminPage = Base.adminUserManagement;
    }

    @When("I log in with the registered user")
    public void iLogInWithTheRegisteredUser() {
        adminPage.login(registeredEmail, registeredPassword);
    }



        @Then("I should be verified as an admin using welcome text on login")
        public void iShouldBeVerifiedAsAdminOnLogin() {
            String actualValue = adminUserManagement.getLoginSuccessMessage().trim();
            System.out.println("Actual login success message: " + actualValue);
            String expectedValue ="Here's who's working today";
            Assert.assertEquals(actualValue, expectedValue,
                    "Expected message: " + expectedValue + ", but got: " + actualValue);
        }

    }





