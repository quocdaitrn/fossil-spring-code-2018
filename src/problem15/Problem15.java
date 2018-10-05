package problem15;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            List<Integer> list = Arrays.asList(sc.nextLine().split(" ")).stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            Line d1 = delta(list.get(0), list.get(1), list.get(2), list.get(3));
            Line d2 = delta(list.get(4), list.get(5), list.get(6), list.get(7));
            Line d3 = delta(list.get(0), list.get(1), list.get(4), list.get(5));


            String result = isParallel(d1, d2) && !isParallel(d1, d3) ? "YES" : "NO";

            System.out.println(result);
        }
    }

    private static Line delta(int x1, int y1, int x2, int y2) {
        return new Line(x2 - x1, y2 - y1);
    }

    private static boolean isParallel(Line line1, Line line2) {
        return line1.getX() * line2.getY() == line1.getY() * line2.getX();
    }

    private static class Line {
        private int x;
        private int y;

        public Line(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
