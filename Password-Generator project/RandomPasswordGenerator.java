import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = getPasswordLength();
        String password = generateRandomPassword(passwordLength);

        System.out.println("Generated Password: " + password);
        System.out.println("Password Length: " + password.length());

        String passwordStrength = checkPasswordStrength(password);
        System.out.println("Password Strength: " + passwordStrength);
    }

    private static int getPasswordLength() {

        int passwordLength = 0;
        do {
            System.out.print("Enter the desired password length (8-16 characters): ");
            Scanner sc = new Scanner(System.in);
            try {
                passwordLength = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } finally {
                sc.close();
            }
        } while (passwordLength < 8 || passwordLength > 16);

        return passwordLength;
    }

    private static String generateRandomPassword(int length) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_+=<>?";

        String allCharacters = uppercaseLetters + lowercaseLetters + digits + symbols;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }

    private static String checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return "Very Weak";
        } else if (password.length() <= 12) {
            return "Weak";
        } else if (password.length() <= 16) {
            return "Medium";
        } else if (password.length() <= 20) {
            return "Strong";
        } else {
            return "Very Strong";
        }
    }
}
