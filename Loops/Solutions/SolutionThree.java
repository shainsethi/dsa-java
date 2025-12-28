package Loops.Solutions;

import java.util.*;

public class SolutionThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count factorial : ");
        int f = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= f; i++) {
            fact = fact * i;
        }

        System.out.println(fact);

    }
}
