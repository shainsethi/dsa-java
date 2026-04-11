package Bitwise;

public class FastExponentiation {

    // Fast Exponentiation using bitwise operators
    // Calculate a^n in O(log n) time
    //
    // Logic: Express the exponent in binary and use the bits to decide
    //        whether to multiply the current power of 'a' into the result
    //
    // Example: a^13 where 13 = 1101 in binary
    //   13 = 2^3 + 2^2 + 2^0 = 8 + 4 + 1
    //   So a^13 = a^8 * a^4 * a^1
    //
    //   Bit 0 (1): multiply result by a^1
    //   Bit 1 (0): skip a^2
    //   Bit 2 (1): multiply result by a^4
    //   Bit 3 (1): multiply result by a^8

    public static long fastPow(int a, int n) {
        long result = 1;
        long base = a;

        while (n > 0) {
            // If last bit is 1, multiply result with current base
            if ((n & 1) == 1) {
                result *= base;
            }
            base *= base; // square the base
            n = n >> 1;   // right shift to check next bit
        }

        return result;
    }

    public static void main(String args[]) {

        int a = 2;
        int n = 13;

        // 13 in binary = 1101
        // a^13 = a^8 * a^4 * a^1 = 256 * 16 * 2 = 8192

        System.out.println(a + "^" + n + " = " + fastPow(a, n));

        // Another example: 3^5
        // 5 = 101 in binary
        // 3^5 = 3^4 * 3^1 = 81 * 3 = 243

        System.out.println("3^5 = " + fastPow(3, 5));

        // 5^3
        // 3 = 11 in binary
        // 5^3 = 5^2 * 5^1 = 25 * 5 = 125

        System.out.println("5^3 = " + fastPow(5, 3));
    }
}
