package problem13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            List<List<Integer>> list = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                List<Integer> lines = Arrays.asList(sc.nextLine().split(" ")).stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

                list.add(lines);

                int size = lines.size();
                if (size > max) {
                    max = size;
                }
            }

            List<Integer> result = new ArrayList<>();

            for (int j = 0; j < max; j++) {
                for (int k = 0; k < n; k++) {
                    if (j < list.get(k).size()) {
                        result.add(list.get(k).get(j));
                    }
                }
            }

            String sResult = "";
            for (Integer e : result) {
                sResult += e + " ";
            }

            System.out.println(sResult.trim());
        }
    }
}
