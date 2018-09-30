package problem11;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            List<Integer> steps = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> goals = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int best = 0;
            int streak = 0;

            for (int j = 0; j < steps.size(); j++) {
                if (steps.get(j) >= goals.get(j)) {
                    streak++;
                } else {
                    if (streak > best) {
                        best = streak;
                    }

                    streak = 0;
                }
            }

            System.out.println(best);
        }
    }
}
