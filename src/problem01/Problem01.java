package problem01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            lines.add(sc.nextLine());
        }

        for (String s : lines) {
            System.out.println(normalize(s));
        }

//        for (String s : lines) {
//            System.out.println(normalizeWithoutTrimRegex(s));
//        }
    }

    public static String normalize(String s) {
        return s.trim().replaceAll(" +", " ");
    }

    public static String normalizeWithoutTrimRegex(String s) {
        return s.replaceAll("^ +| +$|( )+", "$1");
    }
}
