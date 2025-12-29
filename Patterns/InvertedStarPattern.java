package Patterns;

public class InvertedStarPattern {
    public static void main(String args[]) {
        for (int line = 4; line >= 1; line--) {
            for (int s = 1; s <= line; s++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        // Another method
        int n = 5;

        for (int l = 1; l < n; l++) {
            for (int star = 1; star < (n - l + 1); star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
