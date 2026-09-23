package base;

import linx7a.base.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch();
    }

    @Test
    public void shouldReturnTargetIndexForExampleFromTask() {
        int[] numbers = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = solution.search(numbers, target);

        assertEquals(4, result);
    }

    @Test
    public void shouldReturnMinusOneWhenTargetIsNotInArray() {
        int[] numbers = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int result = solution.search(numbers, target);

        assertEquals(-1, result);
    }

    @Test
    public void shouldReturnTargetIndexForTwoElementsArray() {
        int[] numbers = {-1, 12};
        int target = 12;

        int result = solution.search(numbers, target);

        assertEquals(1, result);
    }

    @Test
    public void shouldReturnMinusOneWhenArrayIsEmpty() {
        int[] numbers = {};
        int target = 7;

        int result = solution.search(numbers, target);

        assertEquals(-1, result);
    }

    @Test
    public void shouldReturnTargetIndexForOneElementArray() {
        int[] numbers = {8};
        int target = 8;

        int result = solution.search(numbers, target);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnTargetIndexWhenTargetIsFirstElement() {
        int[] numbers = {-1, 0, 3, 5, 9, 12};
        int target = -1;

        int result = solution.search(numbers, target);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnTargetIndexWhenTargetIsLastElement() {
        int[] numbers = {-1, 0, 3, 5, 9, 12};
        int target = 12;

        int result = solution.search(numbers, target);

        assertEquals(5, result);
    }
}
