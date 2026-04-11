package Bitwise;

public class UpdateIthBit {

    // Update the ith bit to a given value (0 or 1)
    // Logic: If newBit == 1 → Set the bit (OR with bitmask)
    //        If newBit == 0 → Clear the bit (AND with negated bitmask)

    public static void main(String args[]) {

        int value = 1000;
        int i = 2;
        int newBit = 1;

        int bitMask = 1 << i; // 1 << 2 = 0100

        int result;
        if (newBit == 0) {
            // Clear the ith bit
            result = value & ~(bitMask);
        } else {
            // Set the ith bit
            result = value | bitMask;
        }

        System.out.println("Original number: " + value + " (binary: " + Integer.toBinaryString(value) + ")");
        System.out.println("After updating bit " + i + " to " + newBit + ": " + result + " (binary: " + Integer.toBinaryString(result) + ")");

        // Test clearing: update bit 2 to 0
        int newBit2 = 0;
        int result2;
        if (newBit2 == 0) {
            result2 = value & ~(bitMask);
        } else {
            result2 = value | bitMask;
        }

        System.out.println("\nOriginal number: " + value + " (binary: " + Integer.toBinaryString(value) + ")");
        System.out.println("After updating bit " + i + " to " + newBit2 + ": " + result2 + " (binary: " + Integer.toBinaryString(result2) + ")");
    }
}
