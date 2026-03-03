package Neetcode;

public class ProblemSix {

    // Product of Array Except Self

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };

        int prefix[] = new int[arr.length];

        prefix[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        int postfix = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            prefix[i] = prefix[i] * postfix;
            postfix = postfix * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        // int prefix[] = new int[arr.length];
        // int postfix[] = new int[arr.length];

        // prefix[0] = 1;
        // for (int i = 1; i < arr.length; i++) {
        // prefix[i] = prefix[i - 1] * arr[i - 1];
        // }

        // postfix[arr.length - 1] = 1;
        // for (int i = arr.length - 2; i >= 0; i--) {
        // postfix[i] = postfix[i + 1] * arr[i + 1];
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(prefix[i] * postfix[i] + " ");
        // }

    }
}
