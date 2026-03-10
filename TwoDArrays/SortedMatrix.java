package TwoDArrays;

public class SortedMatrix {

    public static void main(String args[]) {

        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int key = 8;

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Found at: " + row + "," + col);
                return;
            }

            else if (key < matrix[row][col]) {
                col--;
            }

            else {
                row++;
            }
        }

        System.out.println("Key not found");
    }
}