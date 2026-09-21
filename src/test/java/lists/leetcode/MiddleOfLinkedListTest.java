package lists.leetcode;

import linx7a.lists.leetcode.MiddleOfLinkedList;
import linx7a.lists.leetcode.MiddleOfLinkedList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MiddleOfLinkedListTest {

    private MiddleOfLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new MiddleOfLinkedList();
    }

    private ListNode buildList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    @Test
    public void shouldReturnMiddleForOddLengthList() {
        ListNode head = buildList(1, 2, 3, 4, 5);

        ListNode result = solution.middleNode(head);

        assertEquals(3, result.val);
    }

    @Test
    public void shouldReturnSecondMiddleForEvenLengthList() {
        ListNode head = buildList(1, 2, 3, 4);

        ListNode result = solution.middleNode(head);

        assertEquals(3, result.val);
    }

    @Test
    public void shouldReturnSecondNodeForTwoElementList(){
        ListNode head = buildList(1, 2);

        ListNode result = solution.middleNode(head);

        assertEquals(2, result.val);
    }

    @Test
    public void shouldReturnSameNodeForSingleElementList() {
        ListNode head = buildList(1);

        ListNode result = solution.middleNode(head);

        assertEquals(1, result.val);
    }

    @Test
    public void shouldReturnNullForEmptyList() {
        ListNode result = solution.middleNode(null);

        assertNull(result);

    }
}
