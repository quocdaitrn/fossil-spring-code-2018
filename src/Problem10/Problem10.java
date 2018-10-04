package Problem10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10 {
    private static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String date = sc.nextLine().trim();

            String[] dateElements = date.split("/");
            int day = Integer.parseInt(dateElements[0]);
            int month = Integer.parseInt(dateElements[1]);
            int year = Integer.parseInt(dateElements[2]);

            if (isLeapYear(year)) {
                map.put(2, 29);
            } else {
                map.put(2, 28);
            }

            int sum = 0;
            for (int j = 1; j < month; j++) {
                sum += map.get(j);
            }

            System.out.println(sum + day);
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
