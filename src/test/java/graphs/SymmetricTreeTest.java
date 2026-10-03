package graphs;

import linx7a.graphs.SymmetricTree;
import linx7a.graphs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeTest {
    private SymmetricTree solution;

    @BeforeEach
    void setUp() {
        solution = new SymmetricTree();
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        TreeNode n = new TreeNode(val);
        n.left = left;
        n.right = right;
        return n;
    }

    private TreeNode leaf(int val) {
        return new TreeNode(val);
    }

    @Test
    void emptyTreeIsSymmetric() {
        assertTrue(solution.isSymmetric(null));
    }

    @Test
    void singleNodeTreeIsSymmetric() {
        assertTrue(solution.isSymmetric(leaf(1)));
    }

    @Test
    void fullSymmetricTreeFromTask() {
        //       1
        //      / \
        //     2   2
        //    / \ / \
        //   3  4 4  3
        TreeNode root = node(1,
                node(2, leaf(3), leaf(4)),
                node(2, leaf(4), leaf(3))
        );
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void symmetricWithGaps() {
        //     1
        //    / \
        //   2   2
        //    \ /
        //    3 3
        TreeNode root = node(1,
                node(2, null, leaf(3)),
                node(2, leaf(3), null));
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void sameShapeButNotMirroredIsNotSymmetric() {
        //     1
        //    / \
        //   2   2
        //    \   \
        //    3    3
        TreeNode root = node(1,
                node (2, null, leaf(3)),
                node(2, null, leaf(3)));
        assertFalse(solution.isSymmetric(root));
    }

    @Test
    void differentValuesIsNotSymmetric() {
        //       1
        //      / \
        //     2   2
        //    / \ / \
        //   3  5 4  3
        TreeNode root = node(1,
                node(2, leaf(3), leaf(5)),
                node(2, leaf(4), leaf(3)));
        assertFalse(solution.isSymmetric(root));
    }
}
