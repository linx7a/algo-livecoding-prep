package arrays;

import linx7a.arrays.MoveZeroes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MoveZeroesTest {
    private MoveZeroes solution;

    @BeforeEach
    void setUp() {
        solution = new MoveZeroes();
    }

    @Test
    public void mixedElements() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void allZeroes() {
        int[] nums = {0, 0, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums);
    }

    @Test
    public void singleZero() {
        int[] nums = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void emptyArray() {
        int[] nums = {};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    public void singleNonZero() {
        int[] nums = {5};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{5}, nums);
    }

    @Test
    public void nullArray() {
        int[] nums = null;
        assertDoesNotThrow(() -> solution.moveZeroes(nums));
    }

    @Test
    void zeroesAtEdges() {
        int[] nums = {0, 5, 3, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{5, 3, 0, 0}, nums);
    }

    @Test
    void zeroInMiddle() {
        int[] nums = {1, 0, 2};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 0}, nums);
    }

    @Test
    void negativeNumbers() {
        int[] nums = {0, -3, 5, 0, -7};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{-3, 5, -7, 0, 0}, nums);
    }
}
