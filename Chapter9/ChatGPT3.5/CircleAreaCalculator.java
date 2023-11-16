import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculating;

        do {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("The area of the circle with radius " + radius + " is " + area);

            System.out.print("Calculate the area of another circle? (Y/N): ");
            String input = scanner.next().toUpperCase();
            continueCalculating = input.charAt(0); // Convert to uppercase and get the first character

            if (continueCalculating != 'Y' && continueCalculating != 'N') {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        } while (continueCalculating == 'Y');

        System.out.println("Thank you for using the Circle Area Calculator.");
    }
}
