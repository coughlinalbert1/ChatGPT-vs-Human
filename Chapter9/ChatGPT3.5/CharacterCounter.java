import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int digitCount = 0;
        int letterCount = 0;
        int whitespaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isWhitespace(ch)) {
                whitespaceCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of whitespace characters: " + whitespaceCount);
    }
}
