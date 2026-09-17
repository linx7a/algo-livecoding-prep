package arrays;

import linx7a.arrays.MoveZeroes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {
    private MoveZeroes solution;

    @BeforeEach
    void setUp() {
        solution = new MoveZeroes();
    }

    @Test
    public void movesZeroesToEndWhenTheyExist() {
        int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

    }
}
