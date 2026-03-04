package TwoDArrays;

import java.util.Scanner;

public class TwoDArrays {

    public static void main(String args[]) {

        // declaration of 2d array
        int matrix[][] = new int[3][3];

        // sc declare
        Scanner sc = new Scanner(System.in);

        // input in 2d array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output print
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
