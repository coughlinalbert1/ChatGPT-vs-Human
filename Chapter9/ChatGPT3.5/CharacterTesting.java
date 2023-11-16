public class CharacterTesting {
    public static void main(String[] args) {
        char ch = 'A';

        // isDigit method
        System.out.println("Is '" + ch + "' a digit? " + Character.isDigit(ch));

        // isLetter method
        System.out.println("Is '" + ch + "' a letter? " + Character.isLetter(ch));

        // isLetterOrDigit method
        System.out.println("Is '" + ch + "' a letter or digit? " + Character.isLetterOrDigit(ch));

        // isUpperCase method
        System.out.println("Is '" + ch + "' uppercase? " + Character.isUpperCase(ch));

        // isLowerCase method
        System.out.println("Is '" + ch + "' lowercase? " + Character.isLowerCase(ch));

        // isWhitespace method
        char whitespaceChar = ' ';
        System.out.println("Is '" + whitespaceChar + "' a whitespace character? " + Character.isWhitespace(whitespaceChar));

        // toLowerCase method
        char upperCaseChar = 'C';
        char lowerCaseChar = Character.toLowerCase(upperCaseChar);
        System.out.println("Lowercase of '" + upperCaseChar + "' is '" + lowerCaseChar + "'");

        // toUpperCase method
        char lowerCaseChar2 = 'd';
        char upperCaseChar2 = Character.toUpperCase(lowerCaseChar2);
        System.out.println("Uppercase of '" + lowerCaseChar2 + "' is '" + upperCaseChar2 + "'");
    }
}
