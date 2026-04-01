package Strings.Problems;

import java.util.*;

public class SolutionTwo {

    public static void main(String args[]) {
        String first = "race";
        String second = "care";

        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() == second.length()) {
            char arr[] = first.toCharArray();
            char arr2[] = second.toCharArray();

            Arrays.sort(arr);
            Arrays.sort(arr2);

            System.out.print(arr.equals(arr2));
        }

        System.out.print("false");
    }
}
