package linx7a.lists;

/**
 * Задача Reverse Linked List.
 *
 * Дана голова односвязного списка. Необходимо реализовать метод reverseList,
 * который разворачивает список так, что порядок узлов становится обратным.
 *
 * Примеры:
 *  Исходный список: 1 -> 2 -> 3 -> null
 *  После reverseList: 3 -> 2 -> 1 -> null
 *
 *  Исходный список: null
 *  После reverseList: null
 *
 * Требования по сложности:
 *  - Временная сложность должна быть O(n), где n — количество узлов.
 *  - Используемая дополнительная память должна быть O(1).
 */
public class ReverseLinkedList {

    /**
     * Узел односвязного списка.
     *
     * Каждая сущность содержит целочисленное значение и ссылку на следующий узел.
     * Ссылка на следующий узел может быть null, если данный узел — последний.
     */
    public static class ListNode {
        /**
         * Значение текущего узла.
         */
        public int val;

        /**
         * Ссылка на следующий узел списка.
         */
        public ListNode next;

        /**
         * Конструктор узла.
         *
         * @param val значение узла
         */
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * Разворачивает односвязный список.
     *
     * Метод принимает голову списка и возвращает голову списка,
     * элементы которого идут в обратном порядке по отношению к исходному.
     *
     * @param head голова исходного списка
     * @return голова развернутого списка
     */
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}