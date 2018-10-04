package problem05;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int currentPosition = p;
            int times = 0;
            if (r < n) {
                times += Math.abs(currentPosition - r) + 1;
                currentPosition = r;
            }

            if (l > 1) {
                times += Math.abs(currentPosition - l) + 1;
                currentPosition = l;
            }

            System.out.println(times);
        }
    }
}
