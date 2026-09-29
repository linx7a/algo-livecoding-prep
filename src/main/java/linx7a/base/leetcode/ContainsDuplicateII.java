package linx7a.base.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача: определить, есть ли в массиве два разных индекса i и j,
 * для которых nums[i] == nums[j] и |i - j| <= k.
 * <p>
 * Если такая пара есть, вернуть true, иначе false.
 * <p>
 * Примеры:
 * nums = [1, 2, 3, 1], k = 3
 * Результат: true (индексы 0 и 3, разница 3)
 * <p>
 * nums = [1, 0, 1, 1], k = 1
 * Результат: true (индексы 2 и 3)
 * <p>
 * nums = [1, 2, 3, 1, 2, 3], k = 2
 * Результат: false (одинаковые числа есть, но расстояние между ними больше k)
 * <p>
 * Требования:
 * - Время: O(n).
 * - Дополнительная память допустима.
 * - Индексы i и j должны быть разными.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current) && (i - map.get(current)) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        return false;
    }
}