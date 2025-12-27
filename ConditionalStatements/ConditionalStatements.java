package ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String args[]) {

        // Print Largest of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A");
        int a = sc.nextInt();
        System.out.println("Enter the number B");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater then B");
        }
        if (a == b) {
            System.out.println("A is equal to B");
        } else {
            System.out.println("B is greater then A");
        }

        // Print even or odd number
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is a even Number");
        } else {
            System.out.print(n + " is odd number");
        }

        // else-if statement
        int a1 = 1;
        int b1 = 3;
        if (a1 > b1) {
            System.out.println("A is greater then B");
        } else if (a1 == b1) {
            System.out.println("A is equal to B");
        } else {
            System.out.println("B is greater then A");
        }

        // Income Tax Calculator
        int income = sc.nextInt();
        int tax; // java automatically assings 0 or "" if we define a char

        if (income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your Tax is : " + tax);

        // Print the largest of three numbers
        int A = 1;
        int B = 3;
        int C = 6;

        if ((A > B) && (A > C))
            System.out.println("A is largest");
        else if ((B > C))
            System.out.println("B is largest");
        else
            System.out.println("C is largest");

        // Calculator Program
        System.out.println("Enter your first number");
        int Number1 = sc.nextInt();
        System.out.println("Enter your second number");
        int Number2 = sc.nextInt();
        System.out.println("Enter the Operator");
        char Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println("Sum is" + (Number1 + Number2));
                break;
            case '-':
                System.out.println("Sub is" + (Number1 - Number2));
                break;
            case '*':
                System.out.println("Product is" + (Number1 * Number2));
                break;
            case '/':
                System.out.println("Quotient is" + (Number1 / Number2));
                break;
            case '%':
                System.out.println("Remainder is" + (Number1 % Number2));
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}