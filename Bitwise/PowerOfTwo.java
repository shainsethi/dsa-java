package Bitwise;

public class PowerOfTwo {

    // Check if a number is a power of 2
    // Logic: A power of 2 has exactly one bit set (e.g., 1, 2, 4, 8, 16...)
    //        n     = 1000 (example: 8)
    //        n - 1 = 0111
    //        n & (n-1) = 0000 → it's a power of 2!
    //
    //        Non-power-of-2 example:
    //        n     = 0110 (6)
    //        n - 1 = 0101
    //        n & (n-1) = 0100 → not 0 → NOT a power of 2

    public static void main(String args[]) {

        int n = 16; // binary: 10000

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is NOT a power of 2");
        }

        // Test with non-power of 2
        int m = 5; // binary: 101
        // 5     = 101
        // 5 - 1 = 100
        // 5 & 4 = 100 → not 0 → NOT a power of 2

        if (m > 0 && (m & (m - 1)) == 0) {
            System.out.println(m + " is a power of 2");
        } else {
            System.out.println(m + " is NOT a power of 2");
        }

        // Test with 1 (2^0)
        int p = 1;
        if (p > 0 && (p & (p - 1)) == 0) {
            System.out.println(p + " is a power of 2");
        } else {
            System.out.println(p + " is NOT a power of 2");
        }
    }
}
