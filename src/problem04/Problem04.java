package problem04;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nTests = Integer.parseInt(sc.nextLine().trim());

        for (int k = 0; k < nTests; k++) {
            String xyn = sc.nextLine().trim();
            String[] aXyn = xyn.split(" ");

            int x = Integer.parseInt(aXyn[0]);
            int y = Integer.parseInt(aXyn[1]);
            int n = Integer.parseInt(aXyn[2]);

            String sAlertTime = sc.nextLine().trim();
            String[] alertTimes = sAlertTime.split(" ");

            if (n < x) {
                System.out.println("cannot wake!");
                return;
            }

            for (int i = 0; i < n - x + 1; i++) {
                int diff = calculateMinutes(alertTimes[i], alertTimes[i + x - 1]);
                if (diff <= y) {
                    System.out.println(alertTimes[i + x - 1]);
                    break;
                }
            }
        }
    }

    private static int calculateMinutes(String start, String end) {
        String[] startElements = start.split(":");
        String[] endElements = end.split(":");

        int minutesOfStart = Integer.parseInt(startElements[0]) * 60 + Integer.parseInt(startElements[1]);
        int minutesOfEnd = Integer.parseInt(endElements[0]) * 60 + Integer.parseInt(endElements[1]);

        return minutesOfEnd - minutesOfStart + 1;
    }
}
