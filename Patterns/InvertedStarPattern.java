package Patterns;

public class InvertedStarPattern {
    public static void main(String args[]) {
        for (int line = 4; line >= 1; line--) {
            for (int s = 1; s <= line; s++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
