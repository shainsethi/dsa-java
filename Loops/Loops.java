package Loops;

import java.util.*;

public class Loops {
    public static void main(String[] args) {

        // while loop
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        // Print numbers from 1 to 10
        int number = 1;
        while (number <= 10) {
            System.out.println("number is : " + number);
            number++;
        }

        // Print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count);
            count++;
        }

        // Sum of first N Natural numbers
        int range = sc.nextInt();
        int c = 1;
        int sum = 0;
        while (c <= range) {
            sum += c;
            c++;
        }
        System.out.println(sum);

        // For Loop
        for (int j = 0; j < 4; j++) {
            System.out.println("****");
        }

        // Print reverse of a number
        int numberToBeReversed = 10899;

        while (numberToBeReversed > 0) {
            int lastDigit = numberToBeReversed % 10;
            System.out.print(lastDigit);
            numberToBeReversed = numberToBeReversed / 10;
        }

        System.out.println();

        // Reverse the given Number
        int no = 12345;
        int rev = 0;

        while (no > 0) {
            int ld = no % 10;
            rev = (rev * 10) + ld;
            no = no / 10;
        }

        System.out.println(rev);
    }
}
