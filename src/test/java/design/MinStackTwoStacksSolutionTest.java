package design;

import linx7a.design.MinStackTwoStacksSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTwoStacksSolutionTest {
    private MinStackTwoStacksSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MinStackTwoStacksSolution();
    }

    @Test
    void getMinReturnsCurrentMinimum() {
        solution.push(5);
        solution.push(3);
        solution.push(7);
        assertEquals(3, solution.getMin());
    }

    @Test
    void popRollsBackMinimum() {
        solution.push(5);
        solution.push(3);
        solution.pop();
        assertEquals(5, solution.getMin());
    }

    @Test
    void duplicateMinimumsAreHandledCorrectly() {
        solution.push(2);
        solution.push(2);
        solution.pop();
        assertEquals(2, solution.getMin());
    }

    @Test
    void popOfNonMinimumKeepsMinimum() {
        solution.push(3);
        solution.push(7);
        solution.pop();
        assertEquals(3, solution.getMin());
        assertEquals(3, solution.top());
    }
}
