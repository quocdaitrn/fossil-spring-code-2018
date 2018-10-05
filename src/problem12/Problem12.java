package problem12;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            List<String> numbers = Arrays.asList(sc.nextLine().split(" ")).stream()
                    .map(Problem12::normalize)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println(String.join(" ", numbers));
        }
    }

    private static String normalize(String s) {
        return s.replaceAll("^0+", "");
    }
}
