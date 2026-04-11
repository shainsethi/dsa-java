package Bitwise;

public class GetIthBit {

    // Get the ith bit of a number
    // Logic: Create a bitmask by left-shifting 1 by i positions (1 << i)
    //        AND the number with the bitmask
    //        If result is 0 → ith bit is 0, else → ith bit is 1

    public static void main(String args[]) {

        int n = 5; // binary: 0101
        int i = 2;

        int bitMask = 1 << i; // 1 << 2 = 0100

        // n       = 0101
        // bitMask = 0100
        // n & bitMask = 0100 → not 0 → ith bit is 1

        if ((n & bitMask) == 0) {
            System.out.println("Bit at position " + i + " is: 0");
        } else {
            System.out.println("Bit at position " + i + " is: 1");
        }

        // Another example
        int x = 1010; // decimal 1010
        int y = 1;

        int bitmask = 1 << y; // 1 << 1 = 0010

        if ((x & bitmask) == 0) {
            System.out.println("Bit at position " + y + " is: 0");
        } else {
            System.out.println("Bit at position " + y + " is: 1");
        }
    }
}
