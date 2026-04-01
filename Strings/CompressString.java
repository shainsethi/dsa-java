package Strings;

public class CompressString {

    public static void main(String args[]) {

        String str = "aaabbccc";
        StringBuilder compress = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compress.append(str.charAt(i));

            if (count > 1) {
                compress.append(count);
            }
        }

        System.out.print(compress);
    }
}
