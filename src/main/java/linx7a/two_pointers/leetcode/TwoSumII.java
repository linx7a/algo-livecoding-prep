package linx7a.two_pointers.leetcode;

/**
 * Задача: найти два числа в отсортированном массиве, сумма которых равна target.
 * <p>
 * Дан массив numbers (1-indexed по условию задачи), отсортированный по неубыванию,
 * и целое число target.
 * <p>
 * Нужно найти два числа numbers[index1] и numbers[index2] (1 <= index1 < index2 <= numbers.length),
 * такие что numbers[index1] + numbers[index2] == target.
 * <p>
 * Вернуть индексы index1 и index2 в виде массива [index1, index2] длины 2.
 * <p>
 * Гарантируется, что решение существует и оно ровно одно. Одно и то же число
 * дважды использовать нельзя.
 * <p>
 * Пример:
 * numbers = [2,7,11,15], target = 9
 * Результат: [1,2]  (2 + 7 = 9)
 * <p>
 * Условия:
 * - Размер массива >= 2.
 * - Дополнительная память: O(1).
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {};
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                result = new int[]{left + 1, right + 1};
                break;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}