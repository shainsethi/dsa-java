package Functions.Solutions;

public class SolutionThree {

    public static void isPalindrome(int n) {
        int num = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        if (rev == num) {
            System.out.print("The number " + num + " " + "is Palindrome");
        } else
            System.out.print("The number " + num + " " + "is not Palindrome");
    }

    public static void main(String args[]) {
        isPalindrome(121);
    }
}
