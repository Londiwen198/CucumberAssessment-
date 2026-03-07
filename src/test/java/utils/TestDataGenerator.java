package utils;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.UUID;


public class TestDataGenerator {
        public static String generateFirstName() {
            String raw = UUID.randomUUID().toString().replaceAll("[^A-Za-z]", "");
            String name = raw.substring(0, 6); // take first 6 letters
            return capitalize(name);
        }

        public static String generateLastName() {
            String raw = UUID.randomUUID().toString().replaceAll("[^A-Za-z]", "");
            String name = raw.substring(0, 8); // take first 8 letters
            return capitalize(name);
        }

        private static String capitalize(String input) {
            return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
        }



     public static String generateEmail() {
        return "user" + UUID.randomUUID().toString().substring(0,6) + "@example.com";
    }

    public static String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(10) + "@123";
    }

    public static String generateGroup() {
        return "2nd Group 2026 (2026)";
    }
}
