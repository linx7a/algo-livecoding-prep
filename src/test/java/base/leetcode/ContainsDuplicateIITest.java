package base.leetcode;

import linx7a.base.leetcode.ContainsDuplicateII;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateIITest {
    private ContainsDuplicateII solution;

    @BeforeEach
    public void setUp() {
        solution = new ContainsDuplicateII();
    }

    @Test
    void duplicateWithinKReturnsTrue() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void duplicatesAdjacentReturnsTrue() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    void duplicatesTooFarApartReturnsFalse() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    @Test
    void kIsZeroReturnsFalse() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 1}, 0));
    }

    @Test
    void emptyArrayReturnsFalse() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{}, 3));
    }

    @Test
    void singleElementReturnsFalse() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{5}, 1));
    }

    @Test
    void allUniqueReturnsFalse() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5}, 10));
    }

    @Test
    void mapIsUpdatedToLatestIndexReturnsTrue() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{9, 1, 2, 9, 9}, 1));
    }
}
