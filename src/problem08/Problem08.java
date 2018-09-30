package problem08;

import java.util.*;
import java.util.stream.Collectors;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            Map<Integer, Integer> marks = new HashMap<>();
            Map<Integer, Integer> positions = new HashMap<>();

            int n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                marks.put(j, sc.nextInt());
            }

            Map<Integer, Integer> sortedMarks = marks.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (e1, e2) -> e2, LinkedHashMap::new));

            int po = 1;
            int gap = 0;
            int currentMark = sortedMarks.entrySet().iterator().next().getValue();
            for (Map.Entry<Integer, Integer> entry : sortedMarks.entrySet()) {
                if (entry.getValue() < currentMark) {
                    po += gap;
                    gap = 0;
                    currentMark = entry.getValue();
                }

                gap++;

                positions.put(entry.getKey(), po);
            }

            Map<Integer, Integer> sortedPositions = positions.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (e1, e2) -> e2, LinkedHashMap::new));

            for (Map.Entry<Integer, Integer> entry : sortedPositions.entrySet()) {
                System.out.print(entry.getValue() + " ");
            }
        }
    }
}
