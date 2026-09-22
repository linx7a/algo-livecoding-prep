package two_pointers.leetcode;

import linx7a.two_pointers.leetcode.TwoSumII;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumIITest {
    private TwoSumII solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSumII();
    }

    @Test
    public void shouldReturnIndicesForExampleFromTask() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void shouldReturnIndicesForNonAdjacentNumbers() {
        int[] numbers = {2, 3, 4};
        int target = 6;

        int[] result = solution.twoSum(numbers, target);

        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void shouldReturnIndicesWhenNumbersIncludeNegativeAndZero() {
        int[] numbers = {-1, 0};
        int target = -1;

        int[] result = solution.twoSum(numbers, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }
}
