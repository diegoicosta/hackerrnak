package hr.deque;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static ResourceBundle appBundle = ResourceBundle.getBundle("deque");

    public static void main(String[] args) {
        Iterator<Integer> in = getList("test8").iterator();
        String result = getListUniqueResult("test8");
        Deque<Integer> deque = new ArrayDeque<>();

        int n = in.next();
        int m = in.next();
        int bigUnique = 0;
        int currentUnique = 0;
        int[] map = new int[10000001];

        while (in.hasNext()) {
            int number = in.next();
            deque.add(number);

            if (map[number] == 0) { // new unique
                currentUnique++;
            }
            map[number]++;

            if (deque.size() == m + 1) { // subarray done
                int removed = deque.removeFirst();
                if (map[removed] > 0 && removed != number) {
                    map[removed]--;
                    if (map[removed] == 0)
                        currentUnique--;
                }
            }
            bigUnique = Math.max(currentUnique, bigUnique);
        }
        System.out.println("calculate:" + bigUnique + " result:" + result + " Success:" + (bigUnique == Integer.parseInt(result)));
    }

    private static String getListUniqueResult(String test) {
        return appBundle.getString("deque.input.result." + test);
    }

    private static List<Integer> getList(String test) {
        final String numbers = appBundle.getString("deque.input." + test);
        String[] numbersArray = numbers.split(",");
        return Arrays.stream(numbersArray).map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());
    }
}
