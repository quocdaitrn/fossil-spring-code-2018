package problem21;

import java.util.Arrays;
import java.util.Scanner;

/*
* This problem is used to interview me to Backend in Fossil
* Content:
*   Interviewer gave me a number
*   He asked me to change position of digit
*   to generate a new number larger than old number
*   but smallest in all numbers larger than it
* Example:
*   217485 -> 217548
*/
public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String sNumber = sc.nextLine().trim();

        char[] digits = sNumber.toCharArray();

        int i;
        for (i = n - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            System.out.println("-1");
            return;
        }

        int x = digits[i - 1];
        int min = i;

        for (int j = i + 1; j < n; j++) {
            if (digits[j] > x && digits[j] < digits[min]) {
                min = j;
            }
        }

        swap(digits, i - 1, min);
        Arrays.sort(digits, i, n);

        for (int k = 0; k < n; k++) {
            System.out.print(digits[k]);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
