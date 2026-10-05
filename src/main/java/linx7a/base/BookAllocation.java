package linx7a.base;
/**
 * Задача: Book Allocation Problem.
 *
 * Дан массив books, где books[i] — количество страниц в i-й книге.
 * Есть k студентов.
 *
 * Нужно распределить книги между студентами
 * так, чтобы каждый студент получил хотя бы одну книгу,
 * книги распределяются подряд (без пропусков между ними),
 * и максимальное число страниц, полученное одним студентом,
 * было минимально возможным.
 *
 * Примеры:
 * books = [12, 34, 67, 90], k = 2 => минимальное возможное
 * максимальное число страниц у студента = 113
 *
 * books = [10, 20, 30, 40], k = 2 => ответ = 60
 *
 * Условия:
 * - Длина массива >= k >= 1.
 * - Распределение книг идет по порядку массива,
 *   нельзя разрывать сегменты.
 * - Время выполнения: O(n * log S), где S — диапазон возможных сумм.
 * - Использование дополнительной памяти - O(1).
 */
public class BookAllocation {
    /**
     * Возвращает минимально возможное максимальное количество страниц,
     * полученное одним студентом при распределении книг.
     *
     * @param books массив количества страниц в книгах
     * @param k количество студентов
     * @return минимально возможное максимальное число страниц на одного студента
     */
    public int allocate(int[] books, int k) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < books.length; i++){
            right += books[i];
            left = Math.max(left, books[i]);
        }
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistributeBooks(books, k, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    private boolean canDistributeBooks(int[] books, int k, int maxCountPage) {
        int student = 1;
        int currentSum = 0;
        for (int page : books) {
            if (currentSum + page <= maxCountPage) {
                currentSum  = currentSum + page;
            } else {
                student++;
                currentSum = page;
                if (student > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
