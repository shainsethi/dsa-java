package Arrays;

public class ArraysCC {

  public static void update(int marks[], int notChangable) {
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }

    notChangable = 10;
  }

  public static void main(String args[]) {
    // int x[] = new int[5];
    int marks[] = { 1, 2, 3 };
    int notChangable = 44;
    update(marks, notChangable);
    // marks[0] = marks[0] + 1;

    for (int i = 0; i < marks.length; i++) {
      System.out.print(" " + marks[i]);
    }

    System.out.print(" " + notChangable);
  }

}
