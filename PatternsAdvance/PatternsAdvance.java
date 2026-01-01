package PatternsAdvance;

public class PatternsAdvance {

    /**
     * Logic:
     * 1. Outer loop for rows (1 to n)
     * 2. Inner loop for columns (1 to m)
     * 3. Print '*' if on boundary (i=1, i=rows, j=1, j=cols), else print space
     */
    public static void hollow_rectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // public static void inverted_pyramid(int rows, int columns) {
    // for (int i = 1; i <= rows; i++) {
    // for (int j = 1; j <= columns; j++) {
    // if (i == 4 || j == 4)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // }
    // System.out.println("");
    // }

    // }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
        // inverted_pyramid(4, 4);
    }
}
