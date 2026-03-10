package TwoDArrays;

public class DiagnolMatrix {

    public static void main(String args[]) {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                    sum += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (i + j == matrix.length - 1 && i != j) {
                    System.out.print(matrix[i][j]);
                    sum += matrix[i][j];
                }
            }
        }

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
            if (i != n - i - 1) {
                System.out.print(matrix[i][n - i - 1] + " ");

                sum += matrix[i][n - i - 1];
            }
        }
    }
}
