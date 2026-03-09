package Assertions;

import static org.junit.Assert.*;

public class Assertions {

    public static void assertMandatoryFields(String actualMessage) {
        String expectedError = "Please fill in all fields";
        assertEquals("Mandatory fields validation failed!", expectedError, actualMessage);
    }

    public static void assertFirstName(String actualMessage) {
        String expectedError = "First name must contain only letters and be at least 2 characters long";
        assertEquals("First name validation failed!", expectedError, actualMessage);
    }

    public static void assertLastName(String actualMessage) {
        String expectedError = "Last name must contain only letters and be at least 2 characters long";
        assertEquals("Last name validation failed!", expectedError, actualMessage);
    }

    public static void assertPasswordLength(String actualMessage) {
        String expectedError = "Password must be at least 8 characters long";
        assertEquals("Password length validation failed!", expectedError, actualMessage);
    }

    public static void assertPasswordSpecialChar(String actualMessage) {
        String expectedError = "Password must contain at least one special character";
        assertEquals("Password special character validation failed!", expectedError, actualMessage);
    }

    public static void assertPasswordConfirmation(String actualMessage) {
        String expectedError = "Passwords do not match!";
        assertEquals("Password confirmation validation failed!", expectedError, actualMessage);
    }

    public static void assertCannotDeleteOwnAccount(String actualMessage) {
        String expectedError = "Cannot delete your own account";
        assertEquals("Self-deletion validation failed!", expectedError, actualMessage);
    }
}
