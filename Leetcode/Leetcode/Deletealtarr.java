import java.util.Scanner;
public class Deletealtarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Delete alternate characters
        String result = deleteAlternateCharacters(inputString);

        // Output
        System.out.println("Result after deleting alternate characters: " + result);

        sc.close();
    }

    private static String deleteAlternateCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }
}

    

