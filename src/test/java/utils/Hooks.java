package utils;

import io.cucumber.java.AfterAll;

public class Hooks {


    @AfterAll
    public static void tearDown() {
        // Close the browser once after all scenarios
        Base base = new Base();
        if (base.driver != null) {
            base.driver.quit();
        }
    }
}
