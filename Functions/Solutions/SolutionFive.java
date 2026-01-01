package Functions.Solutions;

public class SolutionFive {

    public static void sum(int n) {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }

        System.out.println(sum);
    }

    public static void main(String args[]) {
        sum(122);
    }

}
