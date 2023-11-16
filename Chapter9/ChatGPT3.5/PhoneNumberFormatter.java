import java.util.Scanner;

public class PhoneNumberFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Choose an action:");
        System.out.println("1. Format the phone number");
        System.out.println("2. Check if the phone number is formatted");
        System.out.println("3. Remove formatting from the phone number");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                String formattedPhoneNumber = formatPhoneNumber(phoneNumber);
                System.out.println("Formatted phone number: " + formattedPhoneNumber);
                break;
            case 2:
                boolean isFormatted = isFormattedPhoneNumber(phoneNumber);
                if (isFormatted) {
                    System.out.println("The phone number is formatted.");
                } else {
                    System.out.println("The phone number is not formatted.");
                }
                break;
            case 3:
                String unformattedPhoneNumber = removePhoneNumberFormatting(phoneNumber);
                System.out.println("Phone number without formatting: " + unformattedPhoneNumber);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Format a phone number as (XXX) XXX-XXXX
    public static String formatPhoneNumber(String phoneNumber) {
        // Assuming the input is a 10-digit number without formatting
        return "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
    }

    // Check if a phone number is formatted as (XXX) XXX-XXXX
    public static boolean isFormattedPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }

    // Remove formatting from a phone number
    public static String removePhoneNumberFormatting(String phoneNumber) {
        return phoneNumber.replaceAll("[()\\s-]", "");
    }
}
