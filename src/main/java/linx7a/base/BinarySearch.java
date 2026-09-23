package linx7a.base;

/**
 * Задача: найти индекс значения target в отсортированном массиве.
 * <p>
 * Если target отсутствует, вернуть -1.
 * <p>
 * Пример:
 * nums = [-1, 0, 3, 5, 9, 12], target = 9
 * Результат: 4
 * <p>
 * Требования:
 * - Массив отсортирован по возрастанию.
 * - Время: O(log n).
 * - Дополнительная память: O(1).
 */
public class BinarySearch {

    /**
     * Выполняет поиск элемента в массиве.
     *
     * @param nums   отсортированный массив
     * @param target искомое значение
     * @return индекс элемента или -1
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}