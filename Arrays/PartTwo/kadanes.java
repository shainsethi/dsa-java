package Arrays.PartTwo;

public class kadanes {
    
    public static void main(String args[]) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSum = Integer.MIN_VALUE;
        int currsm = 0;

        for(int i = 0; i < num.length; i++){
            currsm += num[i];
        }

        if(maxSum < currsm){
            maxSum = currsm;
        }

        if(currsm < 0){
            currsm = 0;
        }

        System.out.println(maxSum);
    }
}