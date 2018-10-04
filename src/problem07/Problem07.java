package problem07;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int m = sc.nextInt();

            int[] am = new int[m];

            for (int j = 0; j < m; j++) {
                am[j] = sc.nextInt();
            }

            int min = getMinItem(am);

            int maxItems = (a - min) / min;
            if (n > maxItems) {
                System.out.println(maxItems);
            } else {
                System.out.println(n);
            }
        }
    }

    private static int getMinItem(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
