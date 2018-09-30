package problem06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem06 {
    private static final Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "khong");
        map.put(1, "mot");
        map.put(2, "hai");
        map.put(3, "ba");
        map.put(4, "bon");
        map.put(5, "nam");
        map.put(6, "sau");
        map.put(7, "bay");
        map.put(8, "tam");
        map.put(9, "chin");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            System.out.println(readNumber(number));
        }
    }

    public static String readNumber(int number) {
        String result = "";

        if (number < 0) {
            result += "am ";
        }

        int absNumber = Math.abs(number);
        if (absNumber >= 1000) {
            result += readThousandNumber(absNumber);
        } else if (absNumber >= 100) {
            result += readHundredNumber(absNumber);
        } else if (absNumber >= 10) {
            result += readDozenNumber(absNumber);
        } else {
            result += map.get(absNumber);
        }

        return result;
    }

    private static String readThousandNumber(int number) {
        String result = "";

        int a = number / 1000;
        int b = (number % 1000) / 100;
        int c = (number % 100) / 10;
        int d = number % 10;

        result += map.get(a) + " nghin";

        int hundred = number % 1000;

        if (hundred >= 100) {
            result += " " + readHundredNumber(hundred);
        } else if (hundred >= 10) {
            result += " " + map.get(b) + " tram " + readDozenNumber(hundred);
        } else if (hundred > 0) {
            result += " " + map.get(b) + " tram le " + map.get(d);
        }

        return result;
    }

    private static String readHundredNumber(int number) {
        String result = "";

        int b = number / 100;
        int d = number % 10;

        result += map.get(b) + " tram";

        int dozen = number % 100;
        if (dozen >= 10) {
            result += " " + readDozenNumber(dozen);
        } else if (dozen > 0) {
            result += " le " + map.get(d);
        }

        return result;
    }

    private static String readDozenNumber(int number) {
        String result = "";

        int c = number / 10;
        int d = number % 10;

        if (c == 1) {
            result += "muoi";
        } else {
            result += map.get(c) + " muoi";
        }

        if (d > 0) {
            if (d == 5) {
                result += " lam";
            } else {
                result += " " + map.get(d);
            }
        }
        return result;
    }
}
