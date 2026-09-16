import linx7a.base.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    void pairsWhenExists() {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();

        int[] result = solution.twoSum(array, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

}
