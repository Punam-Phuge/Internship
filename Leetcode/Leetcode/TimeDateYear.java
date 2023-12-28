import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TimeDateYear {
    public static void main(String[] args) {
        // Example Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date: ");
        int date = scanner.nextInt();
        System.out.print("Enter Month: ");
        int month = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        String result = findWeekday(date, month, year);
        System.out.println("Output: " + result);
        
        //Explaination: On 17th of March 2017 day is Friday

        // Close the scanner
        scanner.close();
    }

    public static String findWeekday(int date, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, date);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }
}

    

