package ConditionalStatements.Solutions;

import java.util.Scanner;

public class SolutionOne {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String type = (number == 0) ? "Zero" : (number > 0 ? "Positive" : "Negative");
        System.out.println(type);
    }

}
