package Strings;

public class SubStrings {

    public static void main(String args[]) {

        String str = "HelloWorld";
        String Sub = "";

        for (int i = 0; i < 4; i++) {
            Sub += str.charAt(i);
        }

        System.out.print(str.substring(0, 5));
        System.out.print(Sub);
    }
}
