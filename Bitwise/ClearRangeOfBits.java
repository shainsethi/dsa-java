package Bitwise;

public class ClearRangeOfBits {

    // Clear a range of bits from position i to position j
    // Logic: Create two masks and combine them
    //   Mask 1: ~0 << (j+1) → keeps bits above position j
    //   Mask 2: (1 << i) - 1 → keeps bits below position i
    //   Final mask = Mask1 | Mask2
    //   AND the number with the final mask to clear bits in range [i, j]

    // Example: range = 1111 (decimal), clear bits from position 1 to 3
    //   ~0 << 4   = ...11110000  (keeps upper bits)
    //   1 << 1     = 0010
    //   (1<<1) - 1 = 0001        (keeps lower bits)
    //   mask = 11110000 | 0001 = 11110001
    //   1111 decimal in binary & mask → clears bits 1 through 3

    public static void main(String args[]) {

        int n = 1111;
        int i = 1; // start position (lower)
        int j = 3; // end position (upper)

        int upperMask = ~(0) << (j + 1); // all 1s above position j
        int lowerMask = (1 << i) - 1;    // all 1s below position i
        int mask = upperMask | lowerMask;

        int result = n & mask;
        System.out.println("Original number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After clearing bits " + i + " to " + j + ": " + result + " (binary: " + Integer.toBinaryString(result) + ")");

        // Another example: clear bits 2 to 4 of 255
        // 255 = 11111111
        // upperMask = ~0 << 5 = ...11100000
        // lowerMask = (1 << 2) - 1 = 00000011
        // mask = 11100011
        // 11111111 & 11100011 = 11100011 = 227

        int n2 = 255;
        int i2 = 2;
        int j2 = 4;
        int upperMask2 = ~(0) << (j2 + 1);
        int lowerMask2 = (1 << i2) - 1;
        int mask2 = upperMask2 | lowerMask2;
        int result2 = n2 & mask2;
        System.out.println("\nOriginal number: " + n2 + " (binary: " + Integer.toBinaryString(n2) + ")");
        System.out.println("After clearing bits " + i2 + " to " + j2 + ": " + result2 + " (binary: " + Integer.toBinaryString(result2) + ")");
    }
}
