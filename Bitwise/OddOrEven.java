package Bitwise;

public class OddOrEven {

    // Check if a number is odd or even using bitwise AND
    // Logic: The last bit of any odd number is 1, and for even it's 0
    //        So (n & 1) gives us the last bit
    //        If last bit is 0 → Even, if 1 → Odd

    public static void main(String args[]) {

        int n = 5;

        // n     = 0101 (binary of 5)
        // 1     = 0001
        // n & 1 = 0001 → not 0 → Odd

        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        // Test with even number
        int m = 8;

        // m     = 1000 (binary of 8)
        // 1     = 0001
        // m & 1 = 0000 → 0 → Even

        if ((m & 1) == 0) {
            System.out.println(m + " is Even");
        } else {
            System.out.println(m + " is Odd");
        }
    }
}
