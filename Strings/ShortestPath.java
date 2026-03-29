package Strings;

public class ShortestPath {

    public static float ShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            }

            else if (dir == 'S') {
                y--;
            }

            else if (dir == 'E') {
                x++;
            }

            else {
                x--;
            }
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.print(ShortestPath(path));
    }
}
