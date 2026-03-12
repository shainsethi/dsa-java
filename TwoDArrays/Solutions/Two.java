package TwoDArrays.Solutions;

import java.util.Arrays;

public class Two {
    public static void main(String args[]) {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int key = 2 - 1;
        int sum = 0;
        int secondarr[] = arr[key];
        System.out.print(Arrays.toString(secondarr));
        for (int n : secondarr) {
            sum += n;
        }
        System.out.println(sum);
    }
}
