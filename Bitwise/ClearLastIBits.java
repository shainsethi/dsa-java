package Bitwise;

public class ClearLastIBits {

    // Clear the last i bits of a number
    // Logic: Create a mask with all 1s shifted left by i positions
    //        ~0 gives all 1s (11111111...)
    //        ~0 << i gives 1s with last i positions as 0
    //        AND with the number clears the last i bits

    // Example: value = 1000 (binary: 1111101000), i = 2
    //   ~0       = 11111111 (all 1s)
    //   ~0 << 2  = 11111100
    //   value & mask → clears last 2 bits

    public static void main(String args[]) {

        int value = 1000;
        int i = 2;

        int mask = ~(0) << i; // all 1s shifted left by i → last i bits become 0

        int result = value & mask;
        System.out.println("Original number: " + value + " (binary: " + Integer.toBinaryString(value) + ")");
        System.out.println("After clearing last " + i + " bits: " + result + " (binary: " + Integer.toBinaryString(result) + ")");

        // Another example: clear last 3 bits of 15
        // 15 = 1111
        // ~0 << 3 = ...11111000
        // 1111 & 1000 = 1000 = 8

        int value2 = 15;
        int i2 = 3;
        int mask2 = ~(0) << i2;
        int result2 = value2 & mask2;
        System.out.println("\nOriginal number: " + value2 + " (binary: " + Integer.toBinaryString(value2) + ")");
        System.out.println("After clearing last " + i2 + " bits: " + result2 + " (binary: " + Integer.toBinaryString(result2) + ")");
    }
}
