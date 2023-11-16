public class ArraySumInRange {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 2;
        int endIndex = 5;

        int sum = sumInRange(numbers, startIndex, endIndex);
        System.out.println("Sum of numbers in the range: " + sum);
    }

    public static int sumInRange(int[] arr, int start, int end) {
        // Base case: If the start and end indices are the same, return the value at that index
        if (start == end) {
            return arr[start];
        }

        // Recursive case: Sum the current element (at the start index) and the sum of the rest of the elements
        int currentSum = arr[start] + sumInRange(arr, start + 1, end);

        return currentSum;
    }
}
