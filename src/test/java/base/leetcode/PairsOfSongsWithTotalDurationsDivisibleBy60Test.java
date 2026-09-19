package base.leetcode;

import linx7a.base.leetcode.PairsOfSongsWithTotalDurationsDivisibleBy60;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PairsOfSongsWithTotalDurationsDivisibleBy60Test {
    private PairsOfSongsWithTotalDurationsDivisibleBy60 solution;
    @BeforeEach
    void setUp() {
        solution = new PairsOfSongsWithTotalDurationsDivisibleBy60();
    }

    @Test
    public void findsPairWhenExists() {
        int[] time = {60, 60, 50, 10};

        int result = solution.numPairsDivisibleBy60(time);

        assertEquals(2, result);
    }
}
