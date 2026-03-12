package TwoDArrays.Solutions;

public class One {
    public static void main(String args[]) {
        int[][] arr = { { 4, 7, 8 }, { 8, 8, 7 } };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.print(count);
        for (int a[] : arr) {
            for (int b : a) {
                System.out.println(b);
            }
        }
    }
}
