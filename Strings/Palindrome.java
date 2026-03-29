package Strings;

public class Palindrome {

    public static void main(String args[]) {

        String test = "racecar";

        for (int i = 0; i < test.length() / 2; i++) {
            int n = test.length() - 1;
            if (test.charAt(i) != test.charAt(n - i)) {
                System.out.print("not");
            }
        }
        System.out.print("yes");
    }
}