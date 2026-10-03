package linx7a.graphs;

/**
 * Задача: определить, является ли бинарное дерево симметричным.
 *
 * Дерево симметрично, если его левая и правая части зеркальны.
 *
 * Пример:
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * Результат: true
 *
 * Требования:
 * - Время: O(n).
 * - Дополнительная память допустима (рекурсия или очередь).
 */
public class SymmetricTree {

    /**
     * Проверяет, симметрично ли дерево.
     *
     * @param root корень дерева
     * @return true, если дерево симметрично
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isMirror(left.right, right.left) && isMirror(left.left, right.right);
    }
}
