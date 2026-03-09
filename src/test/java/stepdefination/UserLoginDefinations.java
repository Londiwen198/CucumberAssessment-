package stepdefination;

import Pages.adminUserManagement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.Base;


public class UserLoginDefinations extends Base {

    adminUserManagement adminPage;

    public UserLoginDefinations() {
        this.adminPage = Base.adminUserManagement;
    }

    @When("I log in with the registered")
    public void iLogInWithTheRegisteredUser() {
        adminPage.login(registeredEmail, registeredPassword);
    }

    }











