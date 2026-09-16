package linx7a.base;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача: найти индексы двух чисел в массиве, сумма которых равна target.
 * <p>
 * Каждый вход имеет ровно одно решение.
 * Один и тот же элемент нельзя использовать дважды.
 * <p>
 * Пример:
 * nums = [2, 7, 11, 15], target = 9
 * Результат: [0, 1]
 * <p>
 * Требования:
 * - Время: O(n).
 * - Дополнительная память допустима.
 * - Возвращаются индексы, а не сами значения.
 */
public class TwoSum {
    public int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int pair = target - array[i];
            if (map.containsKey(pair)) {
                return new int[] {map.get(pair), i};
            }
            map.put(array[i], i);
        }
        return new int[0];
    }
}
