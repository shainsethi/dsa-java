package Bitwise;

public class SetIthBit {

    // Set the ith bit of a number (make it 1)
    // Logic: Create a bitmask (1 << i)
    //        OR the number with the bitmask
    //        OR sets the bit to 1 regardless of its current value

    public static void main(String args[]) {

        int n = 5; // binary: 0101
        int i = 1;

        int bitMask = 1 << i; // 1 << 1 = 0010

        // n       = 0101
        // bitMask = 0010
        // n | bitMask = 0111 = 7

        int result = n | bitMask;
        System.out.println("Original number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After setting bit " + i + ": " + result + " (binary: " + Integer.toBinaryString(result) + ")");

        // Another example: setting bit 3 of 5
        // n       = 0101
        // 1 << 3  = 1000
        // n | bitMask = 1101 = 13

        int i2 = 3;
        int bitMask2 = 1 << i2;
        int result2 = n | bitMask2;
        System.out.println("\nOriginal number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After setting bit " + i2 + ": " + result2 + " (binary: " + Integer.toBinaryString(result2) + ")");
    }
}
