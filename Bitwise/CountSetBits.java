package Bitwise;

public class CountSetBits {

    // Count the number of set bits (1s) in a number
    // Logic: Repeatedly check the last bit using (n & 1)
    //        If it's 1, increment the count
    //        Right-shift n by 1 to check the next bit
    //        Continue until n becomes 0

    // Example: n = 10 (binary: 1010)
    //   1010 & 1 = 0 → count = 0, shift → 0101
    //   0101 & 1 = 1 → count = 1, shift → 0010
    //   0010 & 1 = 0 → count = 1, shift → 0001
    //   0001 & 1 = 1 → count = 2, shift → 0000
    //   n == 0 → stop. Answer: 2

    public static void main(String args[]) {

        int n = 10; // binary: 1010
        int count = 0;
        int original = n;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1; // right shift by 1
        }

        System.out.println("Number of set bits in " + original + " (binary: " + Integer.toBinaryString(original) + "): " + count);

        // Another example: n = 15 (binary: 1111) → 4 set bits
        int n2 = 15;
        int count2 = 0;
        int temp = n2;

        while (temp > 0) {
            if ((temp & 1) == 1) {
                count2++;
            }
            temp = temp >> 1;
        }

        System.out.println("Number of set bits in " + n2 + " (binary: " + Integer.toBinaryString(n2) + "): " + count2);
    }
}
