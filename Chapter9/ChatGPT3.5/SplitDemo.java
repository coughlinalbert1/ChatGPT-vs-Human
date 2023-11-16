public class SplitDemo {
    public static void main(String[] args) {
        String text = "apple,banana,carrot,grape";

        // Split the string into an array of substrings using a comma as the delimiter
        String[] fruits = text.split(",");

        System.out.println("Original string: " + text);

        // Display the individual fruits
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
