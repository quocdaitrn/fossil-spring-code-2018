package problem02;

import java.util.*;

public class Problem02 {
    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put("ch", "c");
        map.put("tr", "c");
        map.put("c", "k");
        map.put("q", "k");
        map.put("đ", "d");
        map.put("gh", "g");
        map.put("ph", "f");
        map.put("ng", "q");
        map.put("ngh", "q");
        map.put("kh", "x");
        map.put("th", "w");
        map.put("d", "z");
        map.put("r", "z");
        map.put("nh", "n'");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ch", "tr", "c", "q", "đ", "gh",
                "ph", "ng", "ngh", "kh", "th", "d", "r", "nh");

        list.sort(Comparator.reverseOrder());

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (String regex : list) {
            s = s.replaceAll(regex, map.get(regex));
        }

        System.out.println(s);
    }
}

