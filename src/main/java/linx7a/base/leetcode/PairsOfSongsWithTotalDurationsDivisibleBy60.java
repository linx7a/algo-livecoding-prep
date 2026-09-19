package linx7a.base.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Pairs of Songs With Total Durations Divisible by 60
 * -------------------------------------------------------------
 * Дано: целочисленный массив time, где time[i] — длительность i-й песни в секундах.
 * Требуется: посчитать количество пар песен (i, j), где i < j,
 *   таких что суммарная длительность (time[i] + time[j]) делится на 60 без остатка.
 *
 * Вход / Выход — примеры:
 *   Input: time = [30, 20, 150, 100, 40]
 *   Output: 3
 *   Пары: (time[0], time[1]) = (30, 20), (time[1], time[3]) = (20, 100), (time[3], time[4]) = (100, 40)
 *
 *   Input: time = [60, 60, 60]
 *   Output: 3
 *   Пары: (0,1), (0,2), (1,2) — все три комбинации, т.к. 60+60 делится на 60
 *
 * Замечание: метод возвращает int — количество валидных пар, сам массив не модифицируется
 */

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
