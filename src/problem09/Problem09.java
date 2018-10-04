package problem09;

import java.util.*;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();

            String[] arr = s.split(" ");
            Set<String> set = new LinkedHashSet<>();
            for (int j = 0; j < arr.length; j++) {
                set.add(arr[j]);
            }

            for (String item : set) {
                System.out.print(item + " ");
            }
        }
    }
}
