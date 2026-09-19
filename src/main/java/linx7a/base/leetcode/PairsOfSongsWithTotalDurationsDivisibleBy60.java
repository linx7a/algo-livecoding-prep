package linx7a.base.leetcode;

import java.util.HashMap;
import java.util.Map;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int resultCounter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < time.length; i++) {
            int rem = time[i] % 60;
            int complement = (60 - rem) % 60;
            if (map.containsKey(complement)) {
                resultCounter += map.get(complement);
            }

            map.put(rem, map.getOrDefault(rem, 0) +1);
        }
        return resultCounter;
    }
}
