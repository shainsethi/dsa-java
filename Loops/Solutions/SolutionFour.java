package Loops.Solutions;

import java.util.Scanner;

public class SolutionFour {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(table * i);
        }
    }
}
