package two_pointers;

import linx7a.two_pointers.ContainerWithMostWater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater solution;

    @BeforeEach
    void setUp() {
        solution = new ContainerWithMostWater();
    }

    @Test
    public void shouldReturnMaxAreaForExampleFromTask() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        assertEquals(49, result);
    }

    @Test
    public void shouldReturnAreaBetweenTwoElements() {
        int[] height = {5, 3};
        int result = solution.maxArea(height);
        assertEquals(3, result);
    }

    @Test
    public void shouldChooseOuterPairOverAdjacentForThreeElements() {
        int[] height = {7, 3, 12};
        int result = solution.maxArea(height);
        assertEquals(14, result);
    }

    @Test
    public void shouldReturnMaxAreaWhenEqualOuterHeightsGiveMaxArea() {
        int[] height = {7, 2, 3, 2, 7};
        int result = solution.maxArea(height);
        assertEquals(28, result);
    }
}
