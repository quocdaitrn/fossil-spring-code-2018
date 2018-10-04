package problem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine().trim());
        }

        for (int i = 0; i < n; i++) {
            char[] digits = list.get(i).toCharArray();

            Arrays.sort(digits);

            int k = 0;
            while (digits[k] == '0') {
                k++;
            }

            char tmp = digits[0];
            digits[0] = digits[k];
            digits[k] = tmp;

            for (int j = 0; j < digits.length; j++) {
                System.out.print(digits[j]);
            }

            System.out.println();
        }
    }
}
