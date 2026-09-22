package linx7a.two_pointers;

/**
 * Задача: найти максимальную площадь контейнера с водой.
 *
 * Дан массив height, где каждый элемент — высота вертикальной линии.
 * Контейнер образуется двумя линиями и осью X.
 *
 * Необходимо выбрать две линии так, чтобы площадь контейнера была максимальной.
 *
 * Пример:
 * height = [1,8,6,2,5,4,8,3,7]
 * Результат: 49
 *
 * Условия:
 * - Размер массива >= 2.
 * - Время выполнения: O(n).
 * - Дополнительная память: O(1).
 */
public class ContainerWithMostWater {

    /**
     * Возвращает максимальную возможную площадь.
     *
     * @param height массив высот
     * @return максимальная площадь
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max = 0;

        while (left < right) {
            int currentMax = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currentMax);
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}