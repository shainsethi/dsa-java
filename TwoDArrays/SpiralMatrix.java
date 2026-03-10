package TwoDArrays;

public class SpiralMatrix {

    public static void main(String args[]) {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(matrix[startRow][i]);
            }

            startRow++;

            for (int j = startRow; j <= endRow; j++) {
                System.out.print(matrix[j][endColumn]);
            }

            endColumn--;

            for (int i = endColumn; i >= startColumn; i--) {
                System.out.print(matrix[endRow][i]);
            }

            endRow--;

            for (int j = endRow; j >= startRow; j--) {
                System.out.print(matrix[j][startColumn]);
            }

            startColumn++;
        }

        System.out.print(matrix.toString());

    }
}
