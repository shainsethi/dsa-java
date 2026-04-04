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

        // get ith bit
        int x = 1010;
        int y = 1;

        int bitmask = 1 << y;
        System.out.print((x & bitmask) == 0 ? "0" : "1");

        // set ith bit
        System.out.print(x | bitmask);

        // clear ith bith
        System.out.print((n & ~(bitmask)));

        // update ith bit
        // setbit == 1
        // clearbit == 0

        int value = 1000;
        int newbit = 1;

        if (newbit == 0) {
            System.out.print((value & ~(bitMask)));
        } else {
            System.out.print(value | bitMask);
        }

        // clear last ith bit
        // ~ = 1 = 0
        // 0 = 1
        // 1111 = 1100
        // 1100

        // -1 ~0 = 1111100 1111111
        // -1 << I
        // 1 = 0000100

        int lastbit = 2;
        int mask = ~(0) << lastbit;
        System.out.println(value & mask);
    }
}
