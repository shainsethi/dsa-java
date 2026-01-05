package Arrays.PartOne;

public class SubArray {
    public static void sub_array(int num[]) {
        int tsb = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                if (smallest > sum) {
                    smallest = sum;
                }
                if (largest < sum) {
                    largest = sum;
                }
                tsb++;
                System.out.println(" => Sum = " + sum);
            }
            System.out.println("");
        }
        System.out.println(" => smallest = " + smallest);
        System.out.println(" => largest = " + largest);
        System.out.print(tsb);
    }

    public static void main(String args[]) {
        int x[] = { 2, 4, 6, 8, 10 };
        sub_array(x);
    }
}
