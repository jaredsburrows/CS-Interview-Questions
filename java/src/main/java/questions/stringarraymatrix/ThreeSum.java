package questions.stringarraymatrix;

import api.Trio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ThreeSum {
    // Time - O(N^2), Space - O(N)
    public static List<Trio<Integer, Integer, Integer>> getSums(int[] numbers, int target) {
        final List<Trio<Integer, Integer, Integer>> answer = new ArrayList<>();
        final Map<Integer, Integer> map = new HashMap<>();

        // O(N) - preprocessing
        for (int key : numbers) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // O(N^2)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            final int key = entry.getKey();

            for (Map.Entry<Integer, Integer> entry2 : map.entrySet()) {
                final int key2 = entry2.getKey();
                final int difference = target - (key + key2);

                // key + difference = target
                if (map.containsKey(difference) && map.get(difference) > 0) {
                    final Trio<Integer, Integer, Integer> trio = new Trio<>(key, key2, difference);

                    answer.add(trio);

                    final int count2 = map.get(key2) != null ? -1 : 0;
                    map.put(key2, count2);
                }
            }
        }

        return answer;
    }
}
