package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class BuiltInSort {
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // Collections works only for objects has the there generic type is object not for primitive types
        Arrays.sort(arr);
        Arrays.sort(arr, 0, 3);
        Arrays.sort(arr, Collections.reverseOrder());
        // reverseOrder internally uses the comparator

        Arrays.sort(arr, (a, b) -> b - a); // something like this 
        Arrays.sort(arr, (a , b) -> a- b)
        // this is called as comparator
        // it its not subtracting a-b it is just checking the condition
        // if b-a is positive then b is greater than a
        // if b-a is negative then a is greater than b
        // if b-a is 0 then a is equal to b


        //java comparator also works like this 
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}