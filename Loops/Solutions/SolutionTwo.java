package Loops.Solutions;

import java.util.*;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int oddSum = 0;
        int evenSum = 0;

        do {
            System.out.println("Enter the number : ");
            int input = sc.nextInt();

            if (input % 2 == 0) {
                evenSum += input;
            }

            else
                oddSum += input;

            System.out.println("press 1 to continue and 0 to exit ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

    }
}
