    package base;

    import linx7a.base.BookAllocation;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    public class BookAllocationTest {
        private BookAllocation solution;

        @BeforeEach
        void setUp() {
            solution = new BookAllocation();
        }

        @Test
        @DisplayName("Должен вернуть 113 для книг [12, 34, 67, 90] и 2 студентов")
        void shouldReturnMaximumFor1ExampleFromTask() {
            int[] books = {12, 34, 67, 90};
            assertEquals(113, solution.allocate(books, 2));
        }

        @Test
        @DisplayName("Должен вернуть 60 для книг [10, 20, 30, 40] и 2 студентов")
        void shouldReturnMaximumFor2ExampleFromTask() {
            int[] books = {10, 20, 30, 40};
            assertEquals(60, solution.allocate(books, 2));
        }

        @Test
        @DisplayName("Должен вернуть сумму всех книг (100), если студент один")
        void shouldReturnSumOfAllBooksWhenOneStudent() {
            int[] books = {10, 20, 30, 40};
            assertEquals(100, solution.allocate(books, 1));
        }

        @Test
        @DisplayName("Должен вернуть самую толстую книгу (40), если студентов столько же, сколько книг")
        void shouldReturnBiggestBookWhenStudentsEqualBooks() {
            int[] books = {10, 20, 30, 40};
            assertEquals(40, solution.allocate(books, 4));
        }

        @Test
        @DisplayName("Должен вернуть 50 для одной книги и одного студента")
        void shouldReturnBookPagesWhenSingleBook() {
            int[] books = {50};
            assertEquals(50, solution.allocate(books, 1));
        }

        @Test
        @DisplayName("Должен вернуть 100 для книг [100, 1, 1, 1] и 2 студентов, так как ответ не меньше самой толстой книги")
        void shouldNotBeLessThanBiggestBook() {
            int[] books = {100, 1, 1, 1};
            assertEquals(100, solution.allocate(books, 2));
        }

        @Test
        @DisplayName("Должен вернуть 40 для книг [10, 20, 30, 40] и 3 студентов")
        void shouldReturnMaximumForThreeStudents() {
            int[] books = {10, 20, 30, 40};
            assertEquals(40, solution.allocate(books, 3));
        }

        @Test
        @DisplayName("Должен вернуть 10 для книг [5, 5, 5, 5] и 2 студентов")
        void shouldReturnMaximumForEqualBooks() {
            int[] books = {5, 5, 5, 5};
            assertEquals(10, solution.allocate(books, 2));
        }

        @Test
        @DisplayName("Должен вернуть 9 для книг [1, 2, 3, 4, 5] и 2 студентов")
        void shouldReturnMaximumForAscendingBooks() {
            int[] books = {1, 2, 3, 4, 5};
            assertEquals(9, solution.allocate(books, 2));
        }

        @Test
        @DisplayName("Должен вернуть 14 для книг [7, 2, 5, 10, 8] и 3 студентов")
        void shouldReturnMaximumForClassicCaseWithThreeStudents() {
            int[] books = {7, 2, 5, 10, 8};
            assertEquals(14, solution.allocate(books, 3));
        }
    }
