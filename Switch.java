import java.util.*;

public class Switch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the month: ");
        String month = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive comparison

        switch (month) {
            case "february":
                System.out.println("28 or 29 Days");
                break;
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("31 Days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Invalid month! Please enter a valid month name.");
        }
    }
}
