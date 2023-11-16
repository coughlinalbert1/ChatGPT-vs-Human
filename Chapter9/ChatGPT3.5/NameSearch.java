import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting letters of the name to search for: ");
        String prefix = scanner.next();

        boolean found = false;

        for (String name : names) {
            if (name.startsWith(prefix)) {
                System.out.println("Found a name that starts with '" + prefix + "': " + name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No names found that start with '" + prefix + "'.");
        }
    }
}
