package Functions;

public class Conversion {

    public static void binaryToDecimal(int n) {
        int num = n;
        int total = 0;
        int power = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            total = total + (lastDigit * (int) (Math.pow(2, power)));
            power++;
            num = num / 10;
        }

        System.out.println(total);
    }

    public static void decimalToBinary(int n) {
        int power = 0;
        int binary = 0;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int) (Math.pow(10, power)));
            power++;
            n = n / 2;
        }

        System.out.print(binary);

    }

    public static void main(String args[]) {
        binaryToDecimal(1000);
        decimalToBinary(8);
    }
}
