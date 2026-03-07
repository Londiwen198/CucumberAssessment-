package stepdefination;

import Pages.adminUserManagement;
import io.cucumber.java.en.And;
import org.testng.Assert;
import utils.Base;

public class DeleteUser extends Base {


    @And("I delete the newly created user")
    public void iDeleteTheNewlyCreatedUser() {
        adminUserManagement.deleteUser(registeredEmail);

    }


}


