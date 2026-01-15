package Arrays.PartTwo;

public class kadanes {

    public static void main(String args[]) {
        int num[] = { -2, -3, -1, -2, -3 };
        int maxSum = Integer.MIN_VALUE;
        int currsm = num[0];

        for (int i = 1; i < num.length; i++) {
            // Decide: start fresh at num[i] OR add num[i] to existing sum
            currsm = Math.max(num[i], currsm + num[i]);
            maxSum = Math.max(maxSum, currsm);
        }

        // It will not work for calculating maximum negative number
        // for (int i = 0; i < num.length; i++) {
        // currsm += num[i];

        // if (currsm < 0) {
        // currsm = 0;
        // }

        // maxSum = Math.max(currsm, maxSum);

        // }

        System.out.println(maxSum);
    }
}