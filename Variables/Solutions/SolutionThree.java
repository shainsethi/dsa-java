package Variables.Solutions;

import java.util.*;

public class SolutionThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        float GST = 0.18f * total;
        float totalAfterGST = total + GST;

        System.out.print(totalAfterGST);
    }
}
