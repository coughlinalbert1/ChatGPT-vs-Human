import java.util.Scanner;

public class CustomerNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a customer number: ");
        String customerNumber = scanner.nextLine();

        if (isValidCustomerNumber(customerNumber)) {
            System.out.println("Customer number is valid.");
        } else {
            System.out.println("Customer number is not in the right format.");
        }
    }

    // Define the format rules for a valid customer number
    public static boolean isValidCustomerNumber(String customerNumber) {
        if (customerNumber.length() == 6) {
            for (int i = 0; i < customerNumber.length(); i++) {
                char ch = customerNumber.charAt(i);
                if (!Character.isDigit(ch)) {
                    return false; // Non-digit character found
                }
            }
            return true; // All characters are digits, and the length is 6
        }
        return false; // Customer number length is not 6
    }
}
