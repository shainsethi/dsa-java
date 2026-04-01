package Strings.Problems;

import java.util.Scanner;

public class SolutionOne {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                count++;
            }
        }

        System.out.print(count);
    }
}
