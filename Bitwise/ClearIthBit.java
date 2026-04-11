package Bitwise;

public class ClearIthBit {

    // Clear the ith bit of a number (make it 0)
    // Logic: Create a bitmask (1 << i), then negate it (~bitMask)
    //        AND the number with the negated bitmask
    //        This turns OFF the ith bit while keeping all others unchanged

    // Example with n = 10 (1010), i = 1:
    //   bitMask  = 1 << 1 = 0010
    //   ~bitMask = 1101 (all bits flipped)
    //
    //   n          = 1010
    //   ~bitMask   = 1101
    //   n & ~bitMask = 1000 = 8

    public static void main(String args[]) {

        int n = 10; // binary: 1010
        int i = 1;

        int bitMask = 1 << i; // 0010

        // ~bitMask = ...11111101
        // n & (~bitMask) clears the ith bit

        int result = n & (~bitMask);
        System.out.println("Original number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After clearing bit " + i + ": " + result + " (binary: " + Integer.toBinaryString(result) + ")");

        // Another example: clear bit 2 of 5
        // n = 5 = 0101
        // bitMask = 1 << 2 = 0100
        // ~bitMask = ...11111011
        // 0101 & 1011 = 0001 = 1

        int n2 = 5;
        int i2 = 2;
        int bitMask2 = 1 << i2;
        int result2 = n2 & (~bitMask2);
        System.out.println("\nOriginal number: " + n2 + " (binary: " + Integer.toBinaryString(n2) + ")");
        System.out.println("After clearing bit " + i2 + ": " + result2 + " (binary: " + Integer.toBinaryString(result2) + ")");
    }
}
