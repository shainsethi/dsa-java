package Arrays.PartTwo;

public class MaxSubarr {
    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            if (largest < sum) {
                largest = sum;
            }
        }

        System.out.println(largest);
    }
}
