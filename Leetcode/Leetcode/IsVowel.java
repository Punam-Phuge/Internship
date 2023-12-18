import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Check if the character is a vowel
        if (isVowel(inputChar)) {
            System.out.println(inputChar + " is a vowel.");
        } else {
            System.out.println(inputChar + " is not a vowel.");
        }

        scanner.close();
    }

    private static boolean isVowel(char c) {
        // Convert the character to lowercase for case-insensitive check
        char lowerCaseChar = Character.toLowerCase(c);

        // Check if the character is a vowel
        return lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u';
    }
}


