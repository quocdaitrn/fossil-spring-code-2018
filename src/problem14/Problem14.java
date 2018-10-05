package problem14;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            long result = 0L;
            for (int j = 0; j < s.length(); j++) {
                int digit = Integer.parseInt(s.substring(j, j + 1));
                result += digit;
            }

            System.out.println(result);
        }
    }
}
