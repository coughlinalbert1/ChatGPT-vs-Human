public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3; // Change this value to the number of disks you want to solve for.
        towerOfHanoi(numDisks, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + source + " to peg " + target);
            return;
        }

        towerOfHanoi(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from peg " + source + " to peg " + target);
        towerOfHanoi(n - 1, auxiliary, target, source);
    }
}
