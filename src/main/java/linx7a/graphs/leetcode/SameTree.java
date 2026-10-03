package linx7a.graphs.leetcode;

import linx7a.graphs.TreeNode;

/**
 * Задача: определить, одинаковы ли два бинарных дерева.
 * <p>
 * Два дерева считаются одинаковыми, если они структурно идентичны
 * и значения в соответствующих узлах совпадают.
 * <p>
 * Пример 1:
 * 1       1
 * / \     / \
 * 2   3   2   3
 * Результат: true
 * <p>
 * Пример 2:
 * 1       1
 * /         \
 * 2           2
 * Результат: false (разная структура)
 * <p>
 * Пример 3:
 * 1       1
 * / \     / \
 * 2   1   1   2
 * Результат: false (разные значения)
 * <p>
 * Требования:
 * - Время: O(n).
 * - Дополнительная память допустима (рекурсия или очередь).
 */
public class SameTree {
    /**
     * Проверяет, одинаковы ли два дерева.
     *
     * @param p корень первого дерева
     * @param q корень второго дерева
     * @return true, если деревья одинаковы
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

