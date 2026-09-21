package linx7a.lists.leetcode;

/**
 * Задача Middle of the Linked List.
 * <p>
 * Дана голова односвязного списка. Необходимо реализовать метод middleNode,
 * который возвращает средний узел списка.
 * <p>
 * Если в списке чётное количество узлов, необходимо вернуть второй из двух
 * средних узлов.
 * <p>
 * Примеры:
 * Исходный список: 1 -> 2 -> 3 -> 4 -> 5 -> null
 * Результат: узел со значением 3
 * <p>
 * Исходный список: 1 -> 2 -> 3 -> 4 -> null
 * Результат: узел со значением 3
 * <p>
 * Требования по сложности:
 * - Временная сложность должна быть O(n), где n — количество узлов.
 * - Используемая дополнительная память должна быть O(1).
 * - Список должен быть пройден не более одного раза.
 */
public class MiddleOfLinkedList {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
