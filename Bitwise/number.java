package Bitwise;

public class number {

    public static void main(String args[]) {

        // check odd or even
        int n = 5;
        System.out.println((n & 1) == 0 ? "true" : "false");

        // get ith bit
        int i = 2;
        int bitMask = 1 << i;

        System.out.println((n & bitMask) == 0 ? "0" : "1");

        // set ith bit
        // 1000
        // |
        // 0010
        // 1010
        System.out.println((n | bitMask));

        // clear ith bit
        // 10 = 1010
        // 1 = 0001

        // i = 1
        // 1 << i

        // 0010

        // 1010
        // ~1101
        // 11110111
        // ______
        // 1000

        System.out.println((n & (~bitMask)));

    }
}
