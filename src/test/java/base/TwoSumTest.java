package base;

import linx7a.base.TwoSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    private TwoSum solution;
    @BeforeEach
    void setUp() {
        solution = new TwoSum();
    }

    @Test
    void findsPairWhenExists() {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void returnsEmptyArrayWhenNoPairExists() {
        int[] array = {1, 2, 3, 4};
        int target = 8;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[0], result);
    }

    @Test
    void returnsPairWhenAnswerAtStart() {
        int[] array = {3, 9, 12, 15};
        int target = 12;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void returnsPairWhenAnswerAtEnd() {
        int[] array = {2, 4, 6, 8};
        int target = 14;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    void findsPairWhenNumbersAreNegative() {
        int[] array = {-5, -10, -3, 12};
        int target = -8;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void findsPairWhenDuplicateNumbers() {
        int[] array = {3, 3};
        int target = 6;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void returnsEmptyArrayWhenArrayIsEmpty() {
        int[] array = {};
        int target = 5;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[0], result);
    }

    @Test
    void returnsEmptyArrayWhenOnlyOneElement() {
        int[] array = {7};
        int target = 10;

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[0], result);
    }
}
