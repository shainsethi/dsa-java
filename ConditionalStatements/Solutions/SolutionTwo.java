package ConditionalStatements.Solutions;

public class SolutionTwo {
    public static void main(String args[]) {
        double temp = 103.5;

        String hasFever = (temp > 100) ? "You have a fever" : "You dont have a fever";
        System.out.println(hasFever);
    }
}
